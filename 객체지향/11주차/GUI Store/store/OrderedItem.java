package store;

import java.util.Scanner;

import facade.UIData;
import mgr.Manageable;

class OrderedItem implements Manageable, UIData {
	Order order;
	Item item;
	int howMany;
	OrderedItem(Order order, Item item, Scanner scan) {
	    howMany = scan.nextInt();
		this.item = item;
		this.order = order;
	}
	int subTotal() {
		return item.price * howMany;
	}
	public void print() {
		System.out.format("[%s] %d�� x %d�� = %d��\n", 
				item.itemName, item.price, howMany, 
				subTotal());
	}
	@Override
	public void read(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean matches(String kwd) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void set(Object[] uitexts) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String[] getUiTexts() {  // "�ֹ���ȣ", "�����", "��ǰ��", "����", "�Ұ�"
		// TODO Auto-generated method stub
		String[] texts = new String[5];
		texts[0] = ""+order.orderId;
		texts[1] = order.user.id;
		texts[2] = item.itemName;
		texts[3] = ""+howMany;
		texts[4] = ""+subTotal();
		return texts;
	}
}