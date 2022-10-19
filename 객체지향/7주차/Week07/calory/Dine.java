package calory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class Dine {
	public static void main(String[] args) {
		Dine a = new Dine();
		a.mymain();
	}
	static Manager foodMgr = new Manager();
	Manager eatMgr = new Manager();
	void mymain() {
		foodMgr.readAll("food.txt", new Factory() {
			@Override
			public Manageable create(Scanner scan) {
				// TODO Auto-generated method stub
				int type = scan.nextInt();
				switch(type) {
				case 1: return new Food();
				case 2: return new DFood();
				default: break;
				}
				return null;
			}
		});
		foodMgr.printAll();
		readEats();
		printEats();
	}
	void readEats() {
		int day, month;
		String eatType;
		Eat eat = null;
		day = eatMgr.scan.nextInt();
		month = eatMgr.scan.nextInt();
		eatType = eatMgr.scan.next();
		eatMgr.readAll("eat.txt", new Factory() {
			@Override
			public Manageable create(Scanner scan) {
				// TODO Auto-generated method stub
				return new Eat();
			}
		});
		//eatMgr.printAll();
		System.out.printf("%d/%d %s ",
				month, day, eatType);
	}
	void printEats() {
		int totalCal = 0;
		for (Manageable m: eatMgr.mList) {
			totalCal += ((Eat)m).getKcal();
		}
		System.out.printf("��Į�θ�: %dkcal\n", totalCal);;	
		eatMgr.printAll();
	}
}