package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Department
{
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<Team> teamList = new ArrayList<Team>();
	
	void run()
	{
		readAll();
		printAll();
		//inputScores();
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.phone.compareTo(arg1.phone);
			}
		});
		printAll();
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.year - arg1.year;
			}
		});
		printAll();
		
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
		System.out.println();	
	}
	void printAllTeams()
	{
		for(Team t : teamList)
			t.print();
	}
	
	void inputScores()
	{
		System.out.println("학생 점수 입력 ");
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
			System.out.print("검색키워드 여러개(빈칸으로 구분):");
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
			System.out.print("팀 검색 키워드 : ");
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
