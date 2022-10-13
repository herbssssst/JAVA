package calory;

import java.util.Scanner;

class DFood extends Food {
	String dunit;
	int size;
	
	DFood() {};

	@Override
	public void read(Scanner scan) {
		super.read(scan);
		size = scan.nextInt();
		dunit = scan.next();
	}
	@Override
	public String toString() {
		return super.toString()
				+ String.format(" %d%s", size, dunit);
	}
	@Override
	int getKcal(int s, String u) {
		if (unit.equals(u))
			return super.getKcal(s, u);
		if (dunit.equals(u))
			return cal*s/size;
		return 0;
	}
	@Override
	String getDetail(int n, String unit) {
		String common = super.getDetail(n,  unit);
		if (dunit.equals(unit))
			return common 
					+ String.format(" -> %dkcal*%d/%d%s=%dkcal", 
					cal, n, size, dunit, getKcal(n, unit));
		return common;
	}
}
