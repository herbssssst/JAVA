package Week04;

import java.util.ArrayList;
import java.util.Scanner;

public class Department 
{
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<Team> teamList = new ArrayList<Team>();
	
	void run()
	{
		readAll();
		//printAll();
		//inputScores();
		readAllTeams();
		printAllTeams();
		printAll();
		//search();
		searchTeam();
	}
	void readAll()
	{
		Student st = null;
		int id = 0;
		while(true)
		{
			id = scan.nextInt();
			if(id==0)
				break;
			st = new Student(id);
			st.read(scan);
			
			studentList.add(st);
		}
	}
	void readAllTeams()
	{
		String token = null;
		Team t = null;
		while(true) {
			token = scan.next();
			if(token.equals("end"))
				break;
			t = new Team(token);
			t.read(scan, this);
			teamList.add(t);
		}
	}
	
	void printAll()
	{
		int i=1;
		for(Student st : studentList)
		{
			System.out.printf("%2d) ", i++);
			st.print();
		}
			
	}
	void printAllTeams()
	{
		for(Team t : teamList)
			t.print();
	}
	
	void inputScores()
	{
		System.out.println("�л� ���� �Է� ");
		for(Student st:studentList)
		{
			st.inputScore(scan);
		}
	}
	
	void search()
	{
		String line = null;
		String[] kwdArr;
		scan.nextLine();
		
		while (true) 
		{
			System.out.print("�˻�Ű���� ������(��ĭ���� ����):");
			line = scan.nextLine();
			kwdArr = line.split(" ");
			
			for(Student st : studentList) 
			{
				 if (st.matches(kwdArr))
					 st.print();
			}
		}
	}
	void searchTeam()
	{
		String kwd = null;
		while(true) {
			System.out.print("�� �˻� Ű���� : ");
			kwd = scan.next();
			if(kwd.contentEquals("end"))
				break;
			for(Team t : teamList)
			{
				if(t.matches(kwd))
					t.print();
			}
		}	
	}
	
	Student findStudent(int studentNumber) {
		//if(studentNumber > studentList.size())
		if(studentNumber<=0 || studentNumber>studentList.size())
			return null;
		return studentList.get(studentNumber-1);
	}
	
	
	public static void main(String[] args) 
	{
		Department department = new Department();
		department.run();
	}
}