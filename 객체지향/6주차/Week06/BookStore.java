package Week06;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	Scanner scan = new Scanner(System.in);
	ArrayList<Manageable> sellList = new ArrayList<Manageable>();
	
	void run() {
		//readAll("book4.txt");
		readAll();
		printAll();
		search();
	}
	/*void readAll(String filename) {
		Scanner filein = openFile(filename);
		Manageable item = null;
		while(filein.hasNext()){
			int type = filein.nextInt();
			if(n == 0) break;
			switch(type){
				case 1: item = new Book(); break;
				case 2: item = new EBook(); break;
				case 3: item = new AppendixBook(); break;
				case 4: item = new Pen(); break;
				case 5: item = new Tissue(); break;
				default: break;
			}
			item.read(filein);
			sellList.add(item);
		}
		filein.close();
	}*/
	void readAll() {
		Manageable item = null;

		while(true){
			int n = scan.nextInt();
			if(n == 0) break;
			switch(n){
			case 1: item = new Book(); break;
			case 2: item = new EBook(); break;
			case 3: item = new AppendixBook(); break;
			case 4: item = new Pen(); break;
			case 5: item = new Tissue(); break;
			default: break;
			}
			item.read(scan);
			sellList.add(item);
		}
	}
	
	void printAll() {
		for(Manageable m : sellList)
			m.print();
	}
	void search() {
		String kwd = null;
		while(true) {
			System.out.print(">> ");
			kwd = scan.next();
			if(kwd.equals("0")) break;
			for(Manageable m : sellList)
				if(m.matches(kwd))
					m.print();
		}
	}
	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		}
		catch(Exception e) {
			System.out.printf("ÆÄÀÏ ¿ÀÇÂ ¿À·ù : %s\n", filename);
			System.exit(0);
		}
		return filein;
	}
	
	public static void main(String[] args) {
		BookStore store = new BookStore();
		store.run();
	}
}
