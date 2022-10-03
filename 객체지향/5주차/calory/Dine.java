package calory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Dine {
	public static void main(String[] args) {
		Dine a = new Dine();
		a.mymain();
	}	
	ArrayList<Food> foods = new ArrayList<>();
	HashMap<String, Food> foodMap = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	void mymain() {
		readFoods();
		readEats();
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
		System.out.printf("ÃÑÄ®·Î¸®: %dkcal\n", totalCal);;	
		for (Eat f : eatlist)
			System.out.println("  "+f); 
	}
	
	void readFoods() {
		Food m = null;
		
		while (true) {
			int n = scan.nextInt();
			if(n == 0) break;
			
			switch(n){
			case 1: m = new Food(); break;
			case 2: m = new Food2(); break;
			default: break;
			}
			
			m.read(scan);
			foods.add(m);
			foodMap.put(m.name, m);
		}
		for (Food f : foods) {
			System.out.println(f);
		}
	}
	Food findFood(String n) {
		Food f = foodMap.get(n);
		if (f == null) {
			System.out.println("find null => " + n);
			throw new NullPointerException();
		}
		return f;
	}
}