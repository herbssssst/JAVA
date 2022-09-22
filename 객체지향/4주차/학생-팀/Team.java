package Week04;

import java.util.ArrayList;
import java.util.Scanner;

class Team {
	String teamName;
	ArrayList<Student> members = new ArrayList<>();
	
	Team(String name){
		teamName = name;
	}
	
	void read(Scanner scan, Department department) {
		int studentNumber = 0;
		Student st = null;
		while(true) {
			studentNumber = scan.nextInt();
			if(studentNumber == 0)
				break;
			st = department.findStudent(studentNumber);
			st.setTeam(this);
			members.add(st);
		}
	}
	void print()
	{
		System.out.print(teamName+ " : ");
		for(Student st : members) {
			System.out.print(st.name);
			if(members.indexOf(st) == members.size()-1)
				System.out.println();
			else
				System.out.print(", ");
		}
	}
	boolean matches(String kwd)
	{
		if(teamName.contentEquals(kwd))
			return true;
		for(Student st : members)
		{
			if(st.matches(kwd))
				return true;
		}
		return false;
	}
}
