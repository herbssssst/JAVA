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
		while(true) {
			token = scan.next();
			if(token.equals("0"))
				break;
			Subject sub = department.findSubject(token);
			
			if(sub == null) {
				System.out.println("잘못된 코드입니다 "+token);
				continue;
			}
				
			registeredList.add(sub);
		}
	}
	void print()
	{
		System.out.format("%d %s %s (%d학년)", id, name, phone, year);
		System.out.println();
		for(Subject s : registeredList) {
			System.out.print("\t");
			s.print();
		}
	}
	void printStudent()
	{
		System.out.format("%s ",name);
	}
	
	boolean matches(String kwd)
	{
		if(kwd.length()==1 && Character.isDigit(kwd.charAt(0)))
			return kwd.contentEquals(""+year);
		
		return (name.contains(kwd)||(""+id).contains(kwd)
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
	boolean matchesDay(String kwd)
	{
		for(Subject sub : registeredList)
		{
			if(sub.matches(kwd))
				return true;
		}
		return false;
	}
	
	boolean containsSubject(Subject sub)
	{
		return registeredList.contains(sub);
	}
	
}
