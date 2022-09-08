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
	}
	void createStudent(Student st, Scanner scan)
	{
		//st = new Student();
		st.read(scan);
	}
	void readAll()
	{
		Student st = null;
		for(int i=0; i<5; i++)
		{
			st = new Student();
			createStudent(st, scan);
			//st = new Student();
			//st.read(scan);
			studentList.add(st);
		}
	}
	void printAll()
	{
		for(Student st : studentList)
			st.print();
	}
	
	public static void main(String[] args) 
	{
		Department department = new Department();
		department.run();
	}
}
