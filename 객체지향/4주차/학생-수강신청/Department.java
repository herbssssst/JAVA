package Week04;

import java.util.ArrayList;
import java.util.Scanner;

public class Department 
{
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<Subject> subList = new ArrayList<>();
	
	void run()
	{
		readAllSubject();
		readAll();
		printAllSubject();
		printAll();
		searchStudentBySubject();
		searchDay();
		//search();
	}
	void readAll()
	{
		int id = 0;
		while(true)
		{
			id = scan.nextInt();
			if(id==0)
				break;
			Student st = new Student(id);
			st.read(scan, this);
			studentList.add(st);
		}
	}
	void readAllSubject()
	{
		String token = null;
		while(true) {
			token = scan.next();
			if(token.equals("end"))
				break;
			Subject sub = new Subject(token);
			sub.read(scan);
			subList.add(sub);
		}
	}
	
	void printAll()
	{
		//int i=1;
		for(Student st : studentList)
		{
			//System.out.printf("%2d) ", i++);
			st.print();
		}
			
	}
	void printAllSubject()
	{
		System.out.println();
		for(Subject s : subList)
			s.print();
		
		System.out.println();
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
	void searchStudentBySubject()
	{
		String kwd;
		System.out.print("검색할 과목 : ");
		kwd = scan.next();
		Subject sub = null;
		for(Subject s : subList)
		{
			if(s.matches(kwd))
				sub = s;
			if(sub == null)
			{
				System.out.println("없는 과목명입니다");
				return;
			}
		}
		sub.print();
		for(Student st : studentList)
		{
			if(st.containsSubject(sub))
				st.print();
		}
	}
	void searchDay()
	{
		String kwd;
		System.out.print("검색할 요일 : ");
		kwd = scan.next();
		Subject sub = null;
		System.out.format("%s요일 과목을 수강하는 학생 :", kwd);
		for(Student st : studentList)
		{
			if(st.matchesDay(kwd))
				st.printStudent();
		}
	}
	
	public Subject findSubject(String code)
	{
		for(Subject sub : subList) {
			if(sub.matches(code))
				return sub;
		}
		return null;
	}
	/*public Student findStudent(int num)
	{
		if(num <= 0 || num>studentList.size())
			return null;
		return studentList.get(num-1);
	}*/
	
	public static void main(String[] args) 
	{
		Department department = new Department();
		department.run();
	}
}
