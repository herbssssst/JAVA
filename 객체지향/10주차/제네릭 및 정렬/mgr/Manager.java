package mgr;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Manager <T extends Manageable> {
	public Scanner scan = new Scanner(System.in);
	public ArrayList<T> mList = new ArrayList<>();

	public void printAll() {
		// TODO Auto-generated method stub
		for (T b : mList)
			b.print();
	}

	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.printf("파일 오픈 실패: %s\n", filename);
			System.exit(0);
		}
		return filein;
	}

	public void readAll(String filename, Factory<T> fac) {
		Scanner filein = openFile(filename);
		T b = null;
		while (filein.hasNext()) {
			b = fac.create();
			b.read(filein);
			mList.add(b);
		}
		filein.close();
	}

	public T find(String kwd) {
		for (T b : mList)
			if (b.matches(kwd))
				return b;
		return null;
	}

	public void search(Scanner keyScanner) {
		String kwd = null;
		while (true) {
			System.out.print(">> ");
			kwd = keyScanner.next();
			if (kwd.equals("end"))
				break;
			for (T m : mList) {
				if (m.matches(kwd))
					m.print();
			}
		}
	}
}
