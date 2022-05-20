interface Student
{
	public void study(String subject);
}
interface Employee
{
	default public void work()
	{
		System.out.println("업무 중입니다 ~~~ ");
	}
	public void meeting();
}
class Person implements Student, Employee
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	public void meeting() 
	{
		System.out.println(name+"이 회의중입니다");
	}
	public void study(String subject) 
	{
		System.out.println(name+"이 "+subject+" 수업 중입니다");
	}
}
public class InterEx04 {

	public static void main(String[] args) 
	{
		Person p1 = new Person("홍길동");
		p1.study("자바프로그래밍");
		p1.work();
		
		Student s1 = p1;
		Student s2 = new Person("김영희");
		//s2.work();
		
	}

}
