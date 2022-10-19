package Subject;

import java.util.ArrayList;
import java.util.Scanner;

import mgr.Manageable;
import mgr.Manager;

public class Student implements Manageable
{
	String name;
	private int id;
	private String phone;
	private int year;
	
	ArrayList<Subject> registeredList = new ArrayList<Subject>();
	
	@Override
	public void read(Scanner scan)
	{
		id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
		
		String code = null;
		Subject sub;
		while(true) {
			code = scan.next();
			if(code.equals("0"))
				break;
			sub = (Subject)Department.subjectMgr.find(code);
			
			if(sub == null) {
				System.out.println("잘못된 코드입니다 "+code);
				continue;
			}
				
			registeredList.add(sub);
		}
	}
	@Override
	public void print()
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
	
	@Override
	public boolean matches(String kwd)
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