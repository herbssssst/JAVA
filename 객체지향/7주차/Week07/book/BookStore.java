package book;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class BookStore extends Manager implements Factory {
	Scanner scan = new Scanner(System.in);

	void run() 
	{
		readAll("book.txt", this);
		printAll();
		search();
	}
	
	@Override
	public Manageable create(Scanner scan) {
		return new Book();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore store = new BookStore();
		store.run();
	}

}