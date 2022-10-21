package mgr;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	public Scanner scan = new Scanner(System.in);
	public ArrayList<Manageable> mList = new ArrayList<>();

	public void printAll() {
		// TODO Auto-generated method stub
		for (Manageable b : mList)
			b.print();
	}

	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.printf("���� ���� ����: %s\n", filename);
			System.exit(0);
		}
		return filein;
	}

	public void readAll(String filename, Factory fac) {
		Scanner filein = openFile(filename);
		Manageable b = null;
		while (filein.hasNext()) {
			b = fac.create(filein);
			b.read(filein);
			mList.add(b);
		}
		filein.close();
	}

	public Manageable find(String kwd) {
		for (Manageable b : mList)
			if (b.matches(kwd))
				return b;
		return null;
	}

	public void searchAll() {
		String kwd = null;
		while (true) {
			System.out.print("�˻�Ű���� : ");
			kwd = scan.next();
			if(kwd.equals("end"))  break;
			
			for (Manageable b : mList)
				if (b.matches(kwd))
					b.print();
		}
	}
}
