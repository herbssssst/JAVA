package Student;

import java.util.Random;
import java.util.Scanner;

public class Student 
{
	private String name;
	private int id;
	private String phone;
	private int year;
	
	static Random rand = new Random();
	private int score;
	
	Student(int id) 
	{
		this.id = id;
	}
	void read(Scanner scan)
	{
		//this.id = id;
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
	}
	void print()
	{
		System.out.format("%d %s %s (%d학년)", id, name, phone, year);
		if(score != 0)
			System.out.format(" %d점", score);
		System.out.println();
	}
	void inputScore(Scanner scan)
	{
		//System.out.printf("%s: ", name);
		//score = scan.nextInt();
		
		score = rand.nextInt(100);
		System.out.printf("%s: %d\n", name, score);
	}
	boolean matches(String kwd)
	{
		if(kwd.length()==1 && Character.isDigit(kwd.charAt(0)))
			return kwd.contentEquals(""+year);
		
		return (kwd.contentEquals(name)||(""+id).contains(kwd)
				||phone.contains(kwd)||kwd.contentEquals(""+year));
		/*if(kwd.equals(name))
			return true;
		if(kwd.equals(""+id))
			return true;
		if(phone.contains(kwd))
			return true;
		if(kwd.equals(""+year))
			return true;

		return false;*/
	}
	boolean matches(String[] kwdArr)
	{
		for(String kwd : kwdArr)
		{
			if(kwd.charAt(0) == '-')
			{
				kwd = kwd.substring(1);
				if(matches(kwd))
					return false;
			}
			
			else if(!matches(kwd))
				return false;
		}
		return true;
	}
}
// kwd.charAt(0)=='-' \ kwd.substring(1)