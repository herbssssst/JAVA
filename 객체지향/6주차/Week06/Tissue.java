package Week06;

import java.util.Scanner;

public class Tissue implements Manageable{
	String tissueName;
	int nSheets;
	int price;
	
	@Override
	public void read(Scanner scan) {
		tissueName = scan.next();
		nSheets = scan.nextInt();
		price = scan.nextInt();	
	}

	@Override
	public void print() {
		System.out.format("[Tissue] %s %d %d¿ø\n", tissueName, nSheets, price);
	}

	@Override
	public boolean matches(String kwd) {
		if(tissueName.contains(kwd))
			return true;
		if(kwd.equals(nSheets+""))
			return true;
		if(kwd.equals(price+""))
			return true;
		
		return false;
	}
}
