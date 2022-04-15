import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Person
{
	String name;
	String tel;
	
	public Person(String name, String tel)
	{
		this.name = name;
		this.tel = tel;
	}
	public String toString()
	{
		return name+":"+tel;
	}
}
public class ArrList01 {

	public static void main(String[] args) 
	{
		ArrayList<Person> list = new ArrayList<Person>();
		Scanner in = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.print("�̸� �Է� : ");
			String name = in.nextLine();
			System.out.print("��ȭ��ȣ �Է� : ");
			String tel = in.nextLine();
			
			list.add(new Person(name,tel));
		}
		//list.add(new Person("ȫ�浿","010-1111-1234"));
		//list.add(new Person("��ö��","010-2222-1234"));
		//list.add(new Person("�̿���","010-3333-1234"));
		//list.add(new Person("�ں���","010-4444-1234"));
		for(Person p : list)
			System.out.println(p);
	}

}
