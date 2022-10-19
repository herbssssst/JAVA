package calory;

import java.util.Scanner;

import mgr.Manageable;

public class Food implements Manageable {
	static int serialNo=0;
	int id;
	String type;
	String name;
	String unit;
	int cal;
	public void read(Scanner scan) {
		id = ++serialNo;
		type = scan.next();
		name = scan.next();
		unit = scan.next();
		cal = scan.nextInt();
	}
	public void print() {
		System.out.println(this);
	}
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