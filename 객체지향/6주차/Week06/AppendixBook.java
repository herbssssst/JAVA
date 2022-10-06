package Week06;

import java.util.ArrayList;
import java.util.Scanner;

class AppendixBook extends Book {
	ArrayList<String> appendixList = new ArrayList<String>();
	
	/*public AppendixBook(String title) {
		super(title);
	}*/
	@Override
	public void read(Scanner scan) {
		super.read(scan);
		
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			String tmp = scan.next();
			appendixList.add(tmp);
		}	
	}
	
	void printBookType() {
		System.out.print("[부록책] ");
	}
	@Override
	public void print() {
		super.print();
		System.out.print("별책 : ");
		
		for(String list : appendixList)
			System.out.print(list+" ");
		System.out.println();
	}

	@Override
	public boolean matches(String kwd) {
		if(super.matches(kwd))
			return true;
		if(kwd.equals("부록책"))
			return true;
		for(String list : appendixList)
			if(list.contains(kwd))
				return true;
		
		return false;
	}
	

}