package body;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

import mgr.Manageable;

public class Order implements Manageable{
	
	ArrayList<BodyItem> bodyList = new ArrayList<>();
	int id;
	int total;
	int  count;
	
	@Override
	public void read(Scanner scan) {
		id = scan.nextInt();
		
		String name = null;
		BodyItem body;
		while(true) {
			name = scan.next();
			if(name.equals("0"))
				break;
			body = (BodyItem)Store.bodyMgr.find(name);
			body.print();
			bodyList.add(body);
			count++;
			total += body.price;
		}
		
	}
	@Override
	public void print() {
		System.out.format("[%d] ÃÑ %d¿ø (%d°³)", id, total, count);
		System.out.println();
		for(BodyItem b : bodyList) {
			System.out.print("\t");
			System.out.printf("%s\n", b.name);
		}
		
	}
	@Override
	public boolean matches(String kwd) {
		if(kwd.equals(""+id))
			return true;
		else {
			for (Manageable b : bodyList)
				if (b.matches(kwd))
					return true;
		}
		
		return false;
	}
	

}
