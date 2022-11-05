package item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manager;

public class Store {
	Scanner scan = new Scanner(System.in);
	static Manager<Item> itemMgr = new Manager<>();
	static Manager<User> userMgr = new Manager<>();
	static Manager<Order> orderMgr = new Manager<>();
	
	void run() {
		itemMgr.readAll("items.txt", new Factory<Item>() {
			public Item create() {
				return new Item();
			}
		});
		userMgr.readAll("user.txt", new Factory<User>() {
			public User create() {
				return new User();
			}
		});
		orderMgr.readAll("order.txt", new Factory<Order>() {
			public Order create() {
				return new Order();
			}
		});
		login();
		menu();
	}
	void login()
	{
		String id;
		String password;
		User user;
		String userPassword;
		
		while(true)
		{
			System.out.print("���̵� �Է� : ");
			id = scan.next();
			user = userMgr.find(id);
			userPassword = user.pwd;
			
			System.out.print("��й�ȣ �Է� : ");
			password = scan.next();
			if(password.equals(userPassword)) {
				System.out.println("�α��� ����");
				return;	
			}
			else
				System.out.println("�α��� ����. �ٽ� �õ� �ϼ���");
		}
	}
	void menu() {
		int num;
		int num2;
		ArrayList<Item> itemList = itemMgr.mList;
		
		while (true) {
			System.out.print("(1)��ǰ��� (2)�������� (3)�ֹ���� (4)�˻� (��Ÿ) ���� ");
			num = scan.nextInt();
			if (num < 1 || num > 4) break;
			switch(num) {
			case 1: 
				System.out.print("(1)�̸��� (2)�ڵ�� (3)���ݼ� (��Ÿ) ���� ");
				num2 = scan.nextInt();
				switch(num2) {
				case 1:
					Collections.sort(itemList, new Comparator<Item>() {
						@Override
						public int compare(Item o1, Item o2) {
							return (int)o1.name.charAt(0) - (int)o2.name.charAt(0);
						}
					});
					itemMgr.printAll(); break;
					
				case 2: 
					Collections.sort(itemList, new Comparator<Item>() {
						@Override
						public int compare(Item o1, Item o2) {
							for(int i=0; i<Math.min(o1.id.length(), o2.id.length()); i++)
							{
								if((int)o1.id.charAt(i) != (int)o2.id.charAt(i))
									return (int)o1.id.charAt(i) - (int)o2.id.charAt(i);
							}
							return 0;
						}
					});
					itemMgr.printAll(); break;
					
				case 3: 
					Collections.sort(itemList, new Comparator<Item>() {
						@Override
						public int compare(Item o1, Item o2) {
							return o1.price -o2.price;
						}
					});
					itemMgr.printAll(); break;
				default : break;
				}
				break;
			case 2: userMgr.printAll(); break;
			case 3: orderMgr.printAll(); break;
			case 4: searchMenu(); break;
			default: return;
			}
		}
	}
	void searchMenu() {
		int num;
		while (true) {
			System.out.print("(1)��ǰ�˻� (2)����ڰ˻� (3)�ֹ��˻� (��Ÿ) ���� ");
			num = scan.nextInt();
			if (num < 1 || num > 3) break;
			switch(num) {
			case 1: itemMgr.search(scan); break;
			case 2: userMgr.search(scan); break;
			case 3: orderMgr.search(scan); break;
			default: break;
			}
		}
	}
	static Item findItem(String kwd) {
		return itemMgr.find(kwd);
	}
	static User findUser(String kwd) {
		return userMgr.find(kwd);
	}
	static Order findOrder(String kwd) {
		return orderMgr.find(kwd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store m = new Store();
		m.run();
	}
}
