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
		//readAllSubject();
		readAll();
		//printAllSubject();
		printAll();
		//search();
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
			st.read(scan, this);
			studentList.add(st);
		}
	}
	void readAllSubject()
	{
		String token = null;
		Subject sub = null;
		while(true) {
			token = scan.next();
			if(token.equals("end"))
				break;
			sub = new Subject(token);
			sub.read(scan);
			subList.add(sub);
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
	void printAllSubject()
	{
		for(Subject s : subList)
			s.print();
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
	/*void searchStudentBySubject()
	{
		String kwd;
		System.out.print("검색할 과목 : ");
		kwd = scan.next();
		Subject sub = null;
		for(Subject s : subList)
		{
			if(s.matches(kwd))
				sub = s;
		}
		if(sub == null)
		{
			System.out.println("없는 과목명입니다");
			return;
		}
		sub.print();
		for(Student st : studentList)
		{
			if(st.containsSubject(sub))
				st.print();
		}
	}*/
	Subject findSubject(String code)
	{
		for(Subject s : subList) {
			if(s.matches(code))
				return s;
		}
		return null;
	}
	
	public static void main(String[] args) 
	{
		Department department = new Department();
		department.run();
	}
}