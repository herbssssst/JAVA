package Subject;

import java.util.Scanner;

import mgr.Manageable;
import mgr.Manager;

public class Subject implements Manageable
{
	String code;
	String title;
	int year;
	String date;
	String time;
	
	@Override
	public void read(Scanner scan)
	{
		code = scan.next();
		title = scan.next();
		year = scan.nextInt();
		date = scan.next();
		time = scan.next();
	}
	@Override
	public void print()
	{
		System.out.format("[%s] %s %d«–≥‚ (%s%s)\n", code, title, year, date, time);
	}
	@Override
	public boolean matches(String token)
	{
		if(code.contains(token) || title.contains(token) ||
				token.equals(""+year) || token.equals(date) || token.equals(time))
			return true;
		
		return false;
	}
}