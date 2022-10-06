package Week06;

import java.util.ArrayList;
import java.util.Scanner;

public class Pen implements Manageable {
	String itemName;
	float mmThick;
	int price;
	@Override
	public void read(Scanner scan) {
		itemName = scan.next();
		mmThick = scan.nextFloat();
		price = scan.nextInt();	
	}

	@Override
	public void print() {
		System.out.format("[Pen] %s %.1f %d¿ø\n", itemName, mmThick, price);
	}

	@Override
	public boolean matches(String kwd) {
		if(itemName.contains(kwd))
			return true;
		if(kwd.equals(mmThick+""))
			return true;
		if(kwd.equals(price+""))
			return true;
		
		return false;
	}
}
