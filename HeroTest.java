import java.util.Scanner;
//과제
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
		
		return super.toString()+"이 "+level+"로 이동";
	}
	
}
public class HeroTest {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Hero1 h[] = new Hero1[3];
		
		System.out.println("영웅과 무기를 입력하세요");
		for(int i=0; i<h.length; i++)
		{
			System.out.print("영웅 입력 : ");
			String name = in.next();
			System.out.print("무기 입력 : ");
			String level = in.next();
			
			h[i] = new Heroman(name, level); 
		}
		
		for(Hero1 list : h)
			System.out.println(list);
	}

}
