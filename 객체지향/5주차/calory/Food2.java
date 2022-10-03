package calory;

import java.util.Scanner;

public class Food2 extends Food {
	int amount;
	String calUnit;
	
	@Override
	void read(Scanner scan) {
		super.read(scan);
		amount = scan.nextInt();
		calUnit = scan.next();
	}

	@Override
	public String toString() {
		return super.toString()+String.format(" %d%s", amount, calUnit);
	}

	@Override
	int getKcal(int s, String u) {
		return super.getKcal(s, u)/amount;
	}

	@Override
	String getDetail(int n, String unit) {
		return super.getDetail(n, unit)+
				String.format(" -> %dkcal*%d/%d%s=%dkal", cal, n, amount, calUnit, getKcal(n, unit));
	}
}
