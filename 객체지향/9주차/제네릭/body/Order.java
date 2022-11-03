package body;

import java.util.ArrayList;
import java.util.Scanner;

import mgr.Manageable;

public class Order implements Manageable {
	String phone4;
	ArrayList<BodyItem> ordered = new ArrayList<>();
	int total = 0;
	
	@Override
	public void read(Scanner scan) {
		String kwd = null;
		BodyItem b = null;
		phone4 = scan.next();
		while (true) {
			kwd = scan.next();
			if (kwd.equals("0"))
				break;
			b = Store.bodyMgr.find(kwd);
			if (b == null)
				System.out.println(kwd);
			ordered.add(b);
		}
	}
	@Override
	public void print() {
		System.out.format("[%s] 총 %d원 (%d개)\n", phone4, total, ordered.size());	
		for (BodyItem s: ordered) {
			System.out.println('\t'+s.name);
		}
	}
	@Override
	public boolean matches(String kwd) {
		if (phone4.equals(kwd))
			return true;
		for (BodyItem s: ordered) {
			if (s.matches(kwd)) return true;
		}
		return false;
	}
	void service() {
		for (BodyItem s: ordered) {
			 total += s.sell(); 
		}
	}
}