package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class Store {
	private static Store store = null;
	private Store() {}
	public static Store getInstance() {
		if (store == null)
			store = new Store();
		return store;
	}
	Scanner scan = new Scanner(System.in);
	static Manager userMgr = new Manager();
	static Manager itemMgr = new Manager();
	static Manager orderMgr = new Manager();
	public void run() {
		itemMgr.readAll("items.txt", new Factory() {
			public Manageable create() {
				return new Item();
			}
		});
		System.out.println("\n================= �Ǹ� ��ǰ ����Ʈ =================");
		itemMgr.printAll();
		userMgr.readAll("users.txt", new Factory() {
			public Manageable create() {
				return new User();
			}
		});
		orderMgr.readAll("order.txt", new Factory() {
			public Manageable create() {
				return new Order();
			}
		});
		System.out.println("\n================= ��ü �ֹ� ����Ʈ =================");
		orderMgr.printAll();
		System.out.println("\n=============== ����ں� �ֹ� ����Ʈ =================");
		userMgr.printAll();
	}
	static List<String> getStringList(Scanner scan, String end) {
		List<String> strList = new ArrayList<>();
		String tmp;
		while (true) {
			tmp = scan.next();
			if (tmp.contentEquals(end))
				break;
			strList.add(tmp);
		}
		return strList;
	}

	public static boolean isNumeric(String input) {
		try {
			Double.parseDouble(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	public static void main(String args[]) {
		Store store = new Store();
		store.run();
	}
}
