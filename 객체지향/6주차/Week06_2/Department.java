package Week06_2;

import java.util.Scanner;

public class Department extends Manager implements Factory{
	void run() {
		readAll(this);
		printAll();
		inputScores(scan);
		search();
	}

	
	@Override
	public Manageable create(String kwd) {
		return new Student(Integer.parseInt(kwd));
	}
	void inputScores(Scanner scan)
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d = new Department();
		d.run();
	}
}
