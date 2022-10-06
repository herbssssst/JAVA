package Week06;

import java.util.Scanner;

class EBook extends Book {
	String url;
	String format;
	
	/*EBook(String title){
		super(title);
	}*/
	@Override
	public void read(Scanner scan) {
		super.read(scan);
		url = scan.next();
		format = scan.next();
	}
	
	void printBookType() {
		System.out.print("[전자책] ");
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("%s [%s]\n", url, format);
	}

	@Override
	public boolean matches(String kwd) {
		if(super.matches(kwd))
			return true;
		if(kwd.equals("전자책"))
			return true;
		if(url.contains(kwd))
			return true;
		if(format.equals(kwd))
			return true;
		
		return false;
	}
}