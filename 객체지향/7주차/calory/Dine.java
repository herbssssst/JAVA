package calory;

import java.util.ArrayList;
import java.util.Scanner;

public class Dine extends Manager implements Factory {
	public static void main(String[] args) {
		Dine a = new Dine();
		a.mymain();
	}
	void mymain() {
		readAll("food.txt", this);
		printAll();
		readEats();
	}
	
	public Manageable create(Scanner scan) { 
		int n = scan.nextInt();
		switch (n) {
		case 1: return new Food();
		case 2: return new DFood();
		}
		return null;
	}

	ArrayList<Eat> eatlist = new ArrayList<>();
	void readEats() {
		int day, month;
		String eatType;
		Eat eat = null;
		int totalCal = 0;
		month = scan.nextInt();
		day = scan.nextInt();
		eatType = scan.next();
		int cc = scan.nextInt();
		for (int i = 0; i < cc; i++) {
			Eat et = new Eat();
			et.read(scan, this);
			eatlist.add(et);
			totalCal += et.getKcal();
		}
		System.out.printf("%d/%d %s ",
				month, day, eatType);
		System.out.printf("총칼로리: %dkcal\n", totalCal);;	
		for (Eat f : eatlist)
			System.out.println("  "+f); 
	}
}
