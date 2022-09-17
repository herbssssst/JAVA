class Hero
{
	protected String name;
	public Hero(String name)
	{
		this.name = name;
	}
	public void move()
	{
		System.out.println(name+"�� �̵�");
	}
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
		System.out.println(name+"�� �̵�");
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
		System.out.println(name+"�� �̵�");
	}
}
public class HeroTest01 {

	public static void main(String[] args) 
	{
		Hero h[] = new Hero[3];
		h[0] = new Superman("���۸�", "����");
		h[1] = new Spiderman("�����̴���", "�Ź���");
		h[2] = new Batman("��Ʈ��", "�������");
		
		for(Hero list : h)
			list.move();
	}

}
