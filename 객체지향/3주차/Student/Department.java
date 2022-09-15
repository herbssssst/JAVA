package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Department 
{
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	void run()
	{
		readAll();
		printAll();
		//search();
		inputScores();
		printAll();
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
	void printAll()
	{
		for(Student st : studentList)
			st.print();
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
		//String kwd=null;
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
		/*String name = null;
		while(true)
		{
			System.out.print(" 이름 : ");
			name = scan.next();
			if(name.equals("end"))
				break;
			for(Student st : studentList)
			{
				if(st.matches(name)) //st.name.equals(name)
					st.print();
			}
		}*/
		
	}
	public static void main(String[] args) 
	{
		Department department = new Department();
		department.run();
	}
}
