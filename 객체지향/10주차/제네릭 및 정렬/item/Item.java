package item;

import java.util.Scanner;

import mgr.Manageable;

public class Item implements Manageable {
	String id;
	String name;
	int price;
	// F3286 ���������� 1140
	@Override
	public void read(Scanner scan) {
		id = scan.next();
		name = fillLength(scan.next(), 20);
		price = scan.nextInt();
	}
	// ��ƿ��Ƽ �Լ�
	static String fillLength(String origin, int len) {
		StringBuilder buil = new StringBuilder(origin);
		for (int i = origin.getBytes().length; i < len; i++)
			buil.append(' ');
		return buil.toString();
	}
	@Override
	public void print() {
		System.out.printf("[%s] %s\t %5d��\n", id, name, price);
		//System.out.printf("", price);
	}
	@Override
	public boolean matches(String kwd) {
		if (name.contains(kwd))
		    return true;
		if (kwd.length() > 2 && id.contains(kwd))
		    return true;
		return false;
    }
	boolean matches(String[] kwdArr) {
		for (String kwd: kwdArr) {
			if (!matches(kwd))
				return false;
		}
		return true;
	}
	int getSubtotal(int count) {
		return price * count;  // �̺�Ʈ�� ������å ���� ���� �ݿ� ����
	}
}