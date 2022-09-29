package Week05;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	String title;
	String pub;
	String isbn;
	int year;
	int price;
	ArrayList<String> authors = new ArrayList<String>();
	
	/*Book(){
		
	}
	Book(String title){
		this.title = title;
	}*/
	void read(Scanner scan) {
		title = scan.next();
		pub =  scan.next();
		isbn = scan.next();
		year = scan.nextInt();
		//price = scan.nextInt();
		
		String token = null;
		while(true) {
			token = scan.next();
			if(token.contentEquals("0"))
				break;
			authors.add(token);
		}
		price = scan.nextInt();
	}
	
	void printBookType() {
		System.out.print("[�Ϲ�å] ");
	}
	void print() {
		//System.out.print("[�Ϲ�å] ");
		printBookType();
		System.out.printf("%s (%s/%s/%d��) [%d��] ����:", title, pub, isbn, year, price);
		for(String a : authors)
			System.out.print(a+" ");
		System.out.println();
	}
	boolean matches(String kwd) {
		if(kwd.equals("�Ϲ�å"))
			return true;
		if(title.contains(kwd))
			return true;
		if(isbn.contains(kwd))
			return true;
		if(pub.contains(kwd))
			return true;
		if(kwd.equals(year+""))
			return true;
		if(kwd.equals(price+""))
			return true;
		return false;
	}
}
