package Subject;

import java.util.ArrayList;
import java.util.Scanner;

import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class Department 
{
	Scanner scan = new Scanner(System.in);
	Manager studentMgr = new Manager();
	static Manager subjectMgr = new Manager();
	
	void run()
	{
		subjectMgr.readAll("subject.txt", new Factory() 
		{
			@Override
			public Manageable create(Scanner scan) {
				return new Subject();
			}
		});
		subjectMgr.printAll();
		studentMgr.readAll("student.txt", new Factory() 
		{
			@Override
			public Manageable create(Scanner scan) {
				return new Student();
			}
		});
		studentMgr.printAll();
		studentMgr.search();
	}
	
	public static void main(String[] args) 
	{
		Department department = new Department();
		department.run();
	}
}
