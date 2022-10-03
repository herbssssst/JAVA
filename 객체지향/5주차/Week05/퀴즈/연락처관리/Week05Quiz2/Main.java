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
			System.out.println("############ 연락처 관리 ############");
			System.out.print("(1) 연락처 출력  (2) 새로 등록  (3) 삭제  (4) 검색  (5) 수정  (6) 끝내기  ...");
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
		System.out.print("전화번호 : ");
		Human h = new Human(scan.next());
		h.create(scan);
		hList.add(h);
	}
	void search() {
		String kwd;
		int count = 1;
		System.out.print("검색할 키워드 : ");
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
