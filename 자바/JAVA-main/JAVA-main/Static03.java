class Jbank
{
	private String name;
	private double money;
	private static double rate; //������(�����ݸ�) / static - �����ݸ�
	
	public Jbank(String name, double money, double rate)
	{
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	@Override
	public String toString()
	{
		return name+"�Աݾ� : "+money+"(���� : "+rate+")";
	}
}
public class Static03 {

	public static void main(String[] args) 
	{
		Jbank j1 = new Jbank("AA", 1000.0, 0.01);
		System.out.println(j1);
		System.out.println("========================");
		Jbank j2 = new Jbank("BB", 2000.0, 0.02);
		System.out.println(j1);
		System.out.println(j2);
		System.out.println("========================");
		Jbank j3 = new Jbank("CC", 3000.0, 0.03);
		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);
		System.out.println("========================");

	}

}
