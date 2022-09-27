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
		int menu;
		while(true) //수강신청 강의 정보 및 학생 정보는 미리 입력된 사항.
		{
			System.out.print("대분류 (1) 학생 (2) 과목 (3) 연관검색 (0) 종료 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				printAll();
				break;
			case 2:
				printAllSubject();
				break;
			case 3:
				System.out.print("연관검색 메뉴 (1) 과목별 수강생 (2) 요일별 수강생 (3) 타학년 과목 수강생 수 조사 (0) 종료 : ");
				int num = scan.nextInt();
				
				switch(num) {
				case 1 :
					searchStudentBySubject();
					continue;
				case 2:
					searchDay();
					continue;
				case 3:
					searchGrade();
					continue;
				case 0:
					return;
				}
			case 0:
				return;
			}
		}
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
		for(Student st : studentList)
		{
			st.print();
			st.printSubject();
		}
	}
	void printAllSubject()
	{
		for(Subject s : subList) {
			s.print();
			System.out.println();
		}
		
		System.out.println();
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
		}
		if(sub == null)
		{
			System.out.println("없는 과목명입니다");
			return;
		}
		sub.print();
		System.out.println();
		for(Student st : studentList)
		{
			if(st.containsSubject(sub)) {
				System.out.print("\t");
				st.print();
			}
		}
		System.out.println();
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
		System.out.println();
	}
	
	void searchGrade()
	{
		int count;
		Student st = null;
		Subject sub = null;
		for(int i=0; i<subList.size(); i++)
		{
			count = 0;
			sub = subList.get(i);
			for(int j=0; j<studentList.size(); j++)
			{
				st = studentList.get(j);
				if(st.containsSubject(sub))
				{
					if(sub.year != st.year)
						count++;
				}
			}
			sub.print();
			System.out.println(" "+count+"명");
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

	public static void main(String[] args) 
	{
		Department department = new Department();
		department.run();
	}
}