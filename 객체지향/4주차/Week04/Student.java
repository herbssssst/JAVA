package Week04;

import java.util.ArrayList;
import java.util.Scanner;

public class Student 
{
	String name;
	private int id;
	private String phone;
	int year;
	
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
		System.out.format("%d %s %s (%d학년)\n", id, name, phone, year);
	}
	void printStudent()
	{
		System.out.format("%s ",name);
	}
	void printSubject()
	{
		for(Subject s : registeredList) {
			System.out.print("\t");
			s.print();
			System.out.println();
		}
	}
	
	boolean matches(String kwd)
	{
		for(Subject sub : registeredList)
		{
			if(sub.matches(kwd))
				return true;
		}
		return false;
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
		for(int i=0; i<registeredList.size(); i++)
		{
			return registeredList.contains(sub);
		}
		return false;
	}
	
}