package Week05Quiz2;

import java.util.ArrayList;
import java.util.Scanner;

import Week04.Student;
import Week04.Subject;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Human> hList = new ArrayList<Human>();
	
	void run() {
		readAll();
		
		int menu = 0;
		while(true) {
			System.out.println("############ ����ó ���� ############");
			System.out.print("(1) ����ó ���  (2) ���� ���  (3) ����  (4) �˻�  (5) ����  (6) ������  ...");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				printAll();
				break;
			case 2:
				createHuman();
				break;
			case 3:
				break;
			case 4:
				search();
				break;
			case 5:
				break;
			case 6:
				return;
			}
		}
	}
	void readAll()
	{
		String phone = null;
		while(true)
		{
			phone = scan.next();
			if(phone.equals("end"))
				break;
			Human h = new Human(phone);
			h.read(scan);
			hList.add(h);
		}
	}
	void printAll()
	{
		int count = 1;
		for(Human h : hList) {
			System.out.printf("[%d] ", count);
			h.print();
			count++;
		}
			
	}
	void createHuman() {
		System.out.print("��ȭ��ȣ : ");
		Human h = new Human(scan.next());
		h.create(scan);
		hList.add(h);
	}
	void search() {
		String kwd;
		int count = 1;
		System.out.print("�˻��� Ű���� : ");
		kwd = scan.next();
		for(Human list : hList) {
			if(list.matches(kwd)) {
				System.out.printf("[%d] ", count);
				list.print();
				count++;
			}
		}
	}
	public static void main(String[] args) {
		Main my = new Main();
		my.run();
	}
}
