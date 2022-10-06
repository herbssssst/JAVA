package Week06_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	public Scanner scan = new Scanner(System.in);
	ArrayList<Manageable> bookList = new ArrayList<>();

	public void printAll() {
		// TODO Auto-generated method stub
		for (Manageable m : bookList)
			m.print();
	}

	void readAll(Factory fac) {
		String kwd = null;
		Manageable m = null;
		while (true) {
			kwd = scan.next();
			if (kwd.contentEquals("end"))
				break;
			//m = new Book(kwd);
			m = fac.create(kwd);
			m.read(scan);
			bookList.add(m);
		}
	}

	void search() {
		String kwd = null;
		while (true) {
			System.out.print(">> ");
			kwd = scan.next();
			for (Manageable m : bookList)
				if (m.matches(kwd))
					m.print();
		}
	}
}
