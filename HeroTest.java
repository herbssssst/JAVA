import java.util.Scanner;
//����
class Hero1
{
	private String name;
	
	public Hero1(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
}

class Heroman extends Hero1
{
	private String level;
	
	public Heroman(String name, String level)
	{
		super(name);
		this.level = level;
	}
	public String toString()
	{
		
		return super.toString()+"�� "+level+"�� �̵�";
	}
	
}
public class HeroTest {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Hero1 h[] = new Hero1[3];
		
		System.out.println("������ ���⸦ �Է��ϼ���");
		for(int i=0; i<h.length; i++)
		{
			System.out.print("���� �Է� : ");
			String name = in.next();
			System.out.print("���� �Է� : ");
			String level = in.next();
			
			h[i] = new Heroman(name, level); 
		}
		
		for(Hero1 list : h)
			System.out.println(list);
	}

}
