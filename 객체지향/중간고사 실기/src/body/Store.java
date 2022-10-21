package body;

import java.util.ArrayList;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class Store {
	Scanner scan = new Scanner(System.in);
	static Manager bodyMgr = new Manager();
	Manager orderMgr = new Manager();
	
    void run() {
    	bodyMgr.readAll("body.txt", new Factory() {
			@Override
			public Manageable create(Scanner scan) {
				return new BodyItem();
			}
		});
    	bodyMgr.printAll();
    	
    	orderMgr.readAll("order.txt", new Factory() {
			@Override
			public Manageable create(Scanner scan) {
				return new Order();
			}
		});
    	orderMgr.printAll();
    	search();
    }
    private void search() {
		System.out.println("=========== �˻� �޴� ============");
		while (true) {
			System.out.print("(1) ��ǰ   (2) �ֹ�   => ");
			int menu = scan.nextInt();
			if (menu == 1) bodyMgr.searchAll();
			else if (menu == 2) orderMgr.searchAll();
			else break;
		}
	}
    public static void main(String[] args) 
	{
		Store st = new Store();
		st.run();
	}
}

