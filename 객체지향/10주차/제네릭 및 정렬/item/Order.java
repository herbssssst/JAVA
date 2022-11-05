package item;

import java.util.ArrayList;
import java.util.Scanner;

import mgr.Manageable;

public class Order implements Manageable {
	// 2 kim 20201010 F3195 3 F3135 1 F3124 1 0
	int id;
	User user;
	String date;
	int point;  // �ֹ��ݾ� ����Ʈ
	int total;  // �ֹ��ݾ� ���հ�
	ArrayList<Item> orderedItemList = new ArrayList<>();
	ArrayList<Integer> orderedItemCount = new ArrayList<>();;
/*
[�ֹ����̵�: 3] 20201010 �����:  park - �ֹ��ݾ�:  5400 (����Ʈ: 5��)
	 ( 3��) [F3124] ��������            	 1310��
	 ( 1��) [F3223] �����ġ            	 1470��

 */
	@Override
	public void print() {
		print(true);
	}
	void print(boolean bDetail) {
		System.out.printf("[�ֹ����̵�:%2d] %s �����: %s ", id, date, user.userId);
		System.out.printf(" - �ֹ��ݾ�:%5d (����Ʈ: %2d��)\n", total, point);
		if (!bDetail)
			return;
		for (int i = 0; i < orderedItemList.size(); i++) {
			System.out.printf("\t(%2d��)", orderedItemCount.get(i));
			orderedItemList.get(i).print();
		}
	}
	@Override
	public void read(Scanner scan2) {
		// TODO Auto-generated method stub
		id = scan2.nextInt();
		String userId = scan2.next();
		user = Store.findUser(userId);
		date = scan2.next();
		String itemId = scan2.next();
		Item item = null;
		while (!itemId.contentEquals("0")) {
			item = Store.findItem(itemId);
			if (item == null) {
				System.out.printf("ItemId Error: %s", itemId);
				continue;
			}
			orderedItemList.add(item);
			orderedItemCount.add(scan2.nextInt());
			itemId = scan2.next();
		}
		calcTotal();
		point = total / 1000;
		user.addOrder(this);
	}
	void calcTotal() {
		for (int i = 0; i < orderedItemList.size(); i++) {
			total += orderedItemList.get(i).getSubtotal(orderedItemCount.get(i));
		}
	}
	@Override
	public boolean matches(String kwd) {
		if (user.userId.equals(kwd))
			return true;
		if (date.contentEquals(kwd))
			return true;
		for (Item item: orderedItemList) 
			if (item.matches(kwd))
				return true;
		return false;
	}
}