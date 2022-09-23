package Week04;

import java.util.Scanner;

public class Subject {
	String code;
	String title;
	int year;
	String date;
	String time;
	
	Subject(String code) {
		this.code = code;
	}
	void read(Scanner scan)
	{
		title = scan.next();
		year = scan.nextInt();
		date = scan.next();
		time = scan.next();
	}
	void print()
	{
		System.out.format("[%s] %s %d학년 (%s%s)\n", code, title, year, date, time);
	}
	boolean matches(String token)
	{
		if(code.contains(token) || title.contains(token) ||
				token.equals(""+year) || token.equals(date) || token.equals(time))
			return true;
		
		return false;
	}
}
