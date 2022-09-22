package Week04;

import java.util.ArrayList;
import java.util.Scanner;

public class Student 
{
	String name;
	private int id;
	private String phone;
	private int year;
	ArrayList<Subject> registeredList = new ArrayList<Subject>();
	
	Student(int id) 
	{
		this.id = id;
	}
	void read(Scanner scan, Department department)
	{
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
		
		String token = null;
		Subject sub = null;
		while(true) {
			token = scan.next();
			if(token.equals("0"))
				break;
			sub = department.findSubject(token);
			registeredList.add(sub);
		}
	}
	void print()
	{
		System.out.format("%d %s %s (%d«–≥‚)", id, name, phone, year);
		System.out.println();
		for(Subject s : registeredList) {
			System.out.print("\t");
			s.print();
		}
	}
	
	boolean matches(String kwd)
	{
		if(kwd.length()==1 && Character.isDigit(kwd.charAt(0)))
			return kwd.contentEquals(""+year);
		
		return (kwd.contentEquals(name)||(""+id).contains(kwd)
				||phone.contains(kwd)||kwd.contentEquals(""+year));
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