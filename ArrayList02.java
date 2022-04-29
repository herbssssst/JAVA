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
	@Override
	public String toString()
	{
		return name+":"+tel;
	}
}
public class ArrayList02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList <Person> list = new ArrayList<Person>();
		
		for(int i=0; i<3; i++)
		{
			System.out.print("이름 입력 : ");
			String name = in.nextLine();
			System.out.print("전화번호 입력 : ");
			String tel = in.nextLine();

			list.add(new Person(name, tel));
		}
		for(Person p : list)
			System.out.println(p);
	}

}
