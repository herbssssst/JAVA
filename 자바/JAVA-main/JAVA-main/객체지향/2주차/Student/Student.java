package Student;

import java.util.Scanner;

public class Student 
{
	String name;
	int id;
	String phone;
	int year;
	
	void read(Scanner scan)
	{
		id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
	}
	
	void print()
	{
		System.out.printf("%d %s %s (%d�г�)\n", id, name, phone, year);
	}
}
