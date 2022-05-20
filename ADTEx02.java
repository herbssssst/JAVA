/*1. �߻�Ŭ���� : Drink
- ������� : String name(protected)
- �����ڸ� ���� name�� �ʱ�ȭ
- �߻�޼ҵ�� ordering()

2. ����Ŭ���� : Beer, Coffee, MixCoffee(Drink ��ӹ���)
- ������� price
- �����ڷ� �ʱ�ȭ
- ����Ŭ������ �߻�޼ҵ带 ����
  ������� ex) �Ƹ޸�ī���� ���� : 2500

3. ����Ŭ������ ��ü�� ����
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
		System.out.println(name+"�� ���� : "+price);
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
		System.out.println(name+"�� ���� : "+price);
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
		System.out.println(name+"�� ���� : "+price);
	};
}
public class ADTEx02 {

	public static void main(String[] args) 
	{
		Drink d1 = new Coffee("Iceī���ī");
		Drink d2 = new Beer("�׶�");
		Drink d3 = new MixCoffee("�ٹ�Ŀ��");
		Drink d[] = {d1, d2, d3};
		
		System.out.println("======�ֹ��� ���======");
		for(Drink list : d)
		{
			list.Ordering();
		}
	}
}
