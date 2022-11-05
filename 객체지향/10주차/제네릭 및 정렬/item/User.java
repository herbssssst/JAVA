package item;

import java.util.ArrayList;
import java.util.Scanner;

import mgr.Manageable;

public class User implements Manageable {
	// lee lll 0
	String userId;
	String pwd;
	int point;
	ArrayList<Order> myOrderList = new ArrayList<>();
	@Override
	public void read(Scanner scan) {
		userId = scan.next();
		pwd = scan.next();
		point = scan.nextInt();
	}
	/*
	[lee] (10��)
    [�ֹ����̵�: 1] 20201010 �����:   lee - �ֹ��ݾ�:  3420 (����Ʈ: 3��)
    [�ֹ����̵�: 7] 20201011 �����:   lee - �ֹ��ݾ�:  7380 (����Ʈ: 7��)
	 */
	@Override
	public void print() {
		System.out.printf("[%s] (%d��)\n", userId, point);
		for (Order od: myOrderList)
			od.print(false);  // ���� print
	}
	void addOrder(Order order) {
		myOrderList.add(order);
		point += order.point;		
	}
	@Override
	public boolean matches(String kwd) {
		if (userId.equals(kwd))
			return true;
		for (Order od: myOrderList)
			if (od.matches(kwd))
				return true;
		return false;
	}
}