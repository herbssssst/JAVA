abstract class Hero
{
	protected String name;
	public Hero(String name)
	{
		this.name = name;
	}
	public abstract void move();
}
class Superman extends Hero
{
	private String level;
	public Superman(String name, String level)
	{
		super(name);
		this.level = level;
	}
	public void move()
	{
		System.out.println(name+"이 이동");
	}
}
class Spiderman extends Hero
{
	private String level;
	public Spiderman(String name, String level)
	{
		super(name);
		this.level = level;
	}
	public void move()
	{
		System.out.println(name+"이 이동");
	}
}
class Batman extends Hero
{
	private String level;
	public Batman(String name, String level)
	{
		super(name);
		this.level = level;
	}
	public void move()
	{
		System.out.println(name+"이 이동");
	}
}
public class ADT01 {

	public static void main(String[] args) 
	{
		Hero h[] = new Hero[3];
		h[0] = new Superman("슈퍼맨", "망토");
		h[1] = new Spiderman("스파이더맨", "거미줄");
		h[2] = new Batman("배트맨", "오토바이");
		
		for(Hero list : h)
			list.move();
	}

}
