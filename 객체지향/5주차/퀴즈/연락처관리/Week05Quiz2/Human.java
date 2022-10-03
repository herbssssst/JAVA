package Week05Quiz2;

import java.util.Scanner;

class Human 
{
	String phone;
	String name;
	int age;
	
	Human(String phone){
		this.phone = phone;
	}
	void read(Scanner scan) {
		//phone = scan.next();
		name = scan.next();
		age = scan.nextInt();
	}
	void create(Scanner scan) {
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("나이 : ");
		age = scan.nextInt();
	}
	void print() {
		System.out.printf("%5s %2d세 %s\n", name, age, phone);
	}
	boolean matches(String kwd)
	{
		return (name.contains(kwd) || phone.contains(kwd) || kwd.equals(age+""));
	}
}
