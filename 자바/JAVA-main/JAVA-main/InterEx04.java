interface Student
{
	public void study(String subject);
}
interface Employee
{
	default public void work()
	{
		System.out.println("���� ���Դϴ� ~~~ ");
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
		System.out.println(name+"�� ȸ�����Դϴ�");
	}
	public void study(String subject) 
	{
		System.out.println(name+"�� "+subject+" ���� ���Դϴ�");
	}
}
public class InterEx04 {

	public static void main(String[] args) 
	{
		Person p1 = new Person("ȫ�浿");
		p1.study("�ڹ����α׷���");
		p1.work();
		
		Student s1 = p1;
		Student s2 = new Person("�迵��");
		//s2.work();
		
	}

}
