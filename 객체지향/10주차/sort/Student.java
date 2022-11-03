package sort;

import java.util.Random;
import java.util.Scanner;

public class Student implements Comparable<Student>
{
	String name;
	int id;
	String phone;
	int year;
	
	static Random rand = new Random();
	private int score;
	
	Team team;
	void setTeam(Team t) {
		this.team = t;
	}
	
	Student(int id) 
	{
		this.id = id;
	}
	void read(Scanner scan)
	{
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
	}
	void print()
	{
		//System.out.format("%d %s %s (%학년)", id, name, phone, year);
		System.out.format("%d %s %s (%d학년)", id, name, phone, year);
		if(score != 0)
			System.out.format(" %d점", score);
		if(team != null)
            System.out.format(" [%s팀]", team.teamName);
		System.out.println();
	}
	
	void inputScore(Scanner scan)
	{
		score = rand.nextInt(100);
		System.out.printf("%s: %d\n", name, score);
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
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}
}