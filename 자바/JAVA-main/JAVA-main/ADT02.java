class Car
{
	private int oil;
	public Car(int oil)
	{
		this.oil = oil;
	}
	public void print()
	{
		System.out.println("기름의 잔여량은 : "+oil);
	}
}
class HibCar extends Car
{
	private int elec;
	public HibCar(int oil, int elec)
	{
		super(oil);
		this.elec = elec;
	}
	public void print()
	{
		super.print();
		System.out.println("전기의 잔여량은 : "+elec);
	}
}
class WhCar extends HibCar
{
	private int water;
	public WhCar(int oil, int elec, int water)
	{
		super(oil, elec);
		this.water = water;
	}
	public void print()
	{
		super.print();
		System.out.println("수소의 잔여량은 : "+water);
	}
}
public class ADT02 {

	public static void main(String[] args) 
	{
		Car c1 = new Car(20);
		Car c2 = new HibCar(10, 10);
		Car c3 = new WhCar(20, 30, 40);
		Car c[] = {c1,c2,c3};
		for(Car list : c)
		{
			list.print();
			System.out.println("======================");
		}
			
	}

}
