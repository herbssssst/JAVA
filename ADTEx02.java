/*1. 추상클래스 : Drink
- 멤버변수 : String name(protected)
- 생성자를 통해 name을 초기화
- 추상메소드로 ordering()

2. 서브클래스 : Beer, Coffee, MixCoffee(Drink 상속받음)
- 멤버변수 price
- 생성자로 초기화
- 슈퍼클래스의 추상메소드를 구현
  출력형태 ex) 아메리카노의 가격 : 2500

3. 메인클래스에 객체를 생성
*/
abstract class Drink
{
	protected String name;
	public Drink(String name)
	{
		this.name = name;
	}
	public abstract void Ordering();
}
class Coffee extends Drink
{
	private int price;
	public Coffee(String name)
	{
		super(name);
		this.price = 6000;
	}
	public void Ordering()
	{
		System.out.println(name+"의 가격 : "+price);
	};
}
class MixCoffee extends Drink
{
	private int price;
	public MixCoffee(String name)
	{
		super(name);
		this.price = 4000;
	}
	public void Ordering()
	{
		System.out.println(name+"의 가격 : "+price);
	};
}
class Beer extends Drink
{
	private int price;
	public Beer(String name)
	{
		super(name);
		this.price = 9000;
	}
	public void Ordering()
	{
		System.out.println(name+"의 가격 : "+price);
	};
}
public class ADTEx02 {

	public static void main(String[] args) 
	{
		Drink d1 = new Coffee("Ice카페모카");
		Drink d2 = new Beer("테라");
		Drink d3 = new MixCoffee("다방커피");
		Drink d[] = {d1, d2, d3};
		
		System.out.println("======주문서 출력======");
		for(Drink list : d)
		{
			list.Ordering();
		}
	}
}
