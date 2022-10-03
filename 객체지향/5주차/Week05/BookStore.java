package Week05;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	Scanner scan = new Scanner(System.in);
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	void run() {
		//readAll("book3.txt");
		readAllBooks();
		printAllBook();
		search();
	}
	/*void readAllBooks(String filename) {
		Scanner filein = openFile(filename);
		Book b = null;
		while(filein.hasNext()){
			int n = filein.nextInt();
			switch(n){
				case 1: b = new Book(); break;
				case 2: b = new EBook(); break;
				case 3: b = new 
				default: break;
			}
			b.read(filein);
			bookList.add(b);
		}
		filein.close();
	}*/
	void readAllBooks() {
		Book b = null;
		String title = null;
		while(true){
			int n = scan.nextInt();
			//if(n.equals("end")) break;
			if(n == 0) break;
			//title = scan.next();
			switch(n){
				case 1: b = new Book(); break;
				case 2: b = new EBook(); break;
				case 3: b = new AppendixBook(); break;
				default: break;
			}
			b.read(scan);
			bookList.add(b);
		}
	}
	/*void readAllBooks() {
		String title = null;
		Book b = null;
		while(true) {
			title = scan.next();
			if(title.equals("end")) break;
			b = new Book(title);
			b.read(scan);
			bookList.add(b);
		}
	}*/
	void printAll() {
		for(Book b : bookList)
			b.print();
	}
	void printAllBook() {
		for(Book b : bookList)
			b.print();
	}
	void search() {
		String kwd = null;
		while(true) {
			System.out.print(">> ");
			kwd = scan.next();
			if(kwd.equals("0")) break;
			for(Book b : bookList)
				if(b.matches(kwd))
					b.print();
		}
	}
	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		}
		catch(Exception e) {
			System.out.printf("파일 오픈 실패 : %s\n", filename);
			System.exit(0);
		}
		return filein;
	}
	
	public static void main(String[] args) {
		BookStore store = new BookStore();
		store.run();
	}
}
