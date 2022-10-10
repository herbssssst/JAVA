package calory;

import java.util.ArrayList;
import java.util.Scanner;

class Eat {
	int qnty;
	String unit;
	int kcal;
	Food food;
	
	void read(Scanner scan, Manager m) {
		String name = scan.next();
		food = (Food)m.findFood(name);
		qnty = scan.nextInt();
		kcal = getKcal();
		unit = food.unit;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d%s(%dkcal) - %s", 
				food.name, qnty, unit, kcal, food.getDetail(qnty, unit));
	}
	int getKcal() {
		return food.getKcal(qnty,  unit);
	}
}