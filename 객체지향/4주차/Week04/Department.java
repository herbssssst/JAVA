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
		while(true) //������û ���� ���� �� �л� ������ �̸� �Էµ� ����.
		{
			System.out.print("��з� (1) �л� (2) ���� (3) �����˻� (0) ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				printAll();
				break;
			case 2:
				printAllSubject();
				break;
			case 3:
				System.out.print("�����˻� �޴� (1) ���� ������ (2) ���Ϻ� ������ (3) Ÿ�г� ���� ������ �� ���� (0) ���� : ");
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
		System.out.print("�˻��� ���� : ");
		kwd = scan.next();
		Subject sub = null;
		for(Subject s : subList)
		{
			if(s.matches(kwd))
				sub = s;
		}
		if(sub == null)
		{
			System.out.println("���� ������Դϴ�");
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
		System.out.print("�˻��� ���� : ");
		kwd = scan.next();
		Subject sub = null;
		System.out.format("%s���� ������ �����ϴ� �л� :", kwd);
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
			System.out.println(" "+count+"��");
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