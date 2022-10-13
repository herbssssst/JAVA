package calory;

import java.util.Scanner;

public class Food implements Manageable{
	static int serialNo=0;
	int id;
	String type;
	String name;
	String unit;
	int cal;

	Food() {
		id = ++serialNo;
	}
	@Override
	public void read(Scanner scan) {
		type = scan.next();
		name = scan.next();
		unit = scan.next();
		cal = scan.nextInt();
	}
	@Override
	public void print() {
		System.out.print(this);
	}
	@Override
	public boolean matches(String kwd) {
		return name.equals(kwd);
	}
	
	@Override
	public String toString() {
		return String.format("[%2d] %s-%s (%dkcal/%s)",
				id, type, name, cal, unit);
	}
	int getKcal(int s, String u) {
		return s*cal;
	}
	String getDetail(int n, String unit) {
		return String.format("%dkcal/%d%s", 
				cal, 1, this.unit);
	}
}