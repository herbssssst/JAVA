package calory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Manager {
	public Scanner scan = new Scanner(System.in);
	ArrayList<Manageable> foods = new ArrayList<>();
	HashMap<String, Manageable> foodMap = new HashMap<>();
	
	void readFoods(Factory fac) {
		Manageable m = null;

		while (true) {
			String type = scan.next();
			if (type.equals("0"))
				break;
			
			m = fac.create(type);
			m.read(scan);
			foods.add(m);
			
			Food f = (Food)m;
			foodMap.put(f.name, m);
		}
		for (Manageable f : foods) {
			System.out.println(f);
		}
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
		
		System.out.printf("%d/%d %s ",month, day, eatType);
		System.out.printf("ÃÑÄ®·Î¸®: %dkcal\n", totalCal);;	
		for (Eat f : eatlist)
			System.out.println("  "+f); 
	}
	Manageable findFood(String name) {
		Manageable m = foodMap.get(name);
		if (m == null) {
			System.out.println("find null => " + name);
			throw new NullPointerException();
		}
		return m;
	}
}
