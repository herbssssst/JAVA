// 1. ��� (����) : extends
// 2. super.�������, super.�޼ҵ�
// 3. �θ�Ŭ���� �����ڷ� �ʱ�ȭ�Ǿ� �ִٸ� ��ӹ��� �ڽ� Ŭ������ �ݵ�� �����ڷ� �ʱ�ȭ
// 4. �θ�Ŭ������ �ڽ� Ŭ���� �޼ҵ� ������ => �޼ҵ� �������̵�
// 5. �θ�Ŭ������ �ڽ�Ŭ������ ������ �� �ִ� (��Ӱ���) // �߿� !! ������ ����

class Item
{
	public int price;	
}
class Noodle extends Item //�ڽ� Ŭ���� �޴� ���ݰ� �̸��� �����ϴ� 
{
	public Noodle()
	{
		super.price = 4000;
	}
	public String toString()
	{
		return "����";
	}
}
class MixNoodle extends Item
{
	public MixNoodle()
	{
		super.price = 4500;
	}
	public String toString()
	{
		return "�������";
	}
}
class Woodong extends Item
{
	public Woodong()
	{
		super.price = 5000;
	}
	public String toString()
	{
		return "�쵿";
	}
}
class Buyer
{
	int money;
	public Buyer(int money)
	{
		this.money = money;
	}
	public void buy(Item it, int count) //�޴� ����, ����� ���� ���� �� ���
	{
		System.out.println(it+"�� "+count+"�� �ֹ��Ͽ����ϴ�");
		money = money - (it.price*count);
		System.out.println("�ֹ� �� ���� ���� "+money+"�� �Դϴ�");
	}
}
public class Ex01 {

	public static void main(String[] args) 
	{
		Item it1 = new Noodle();
		System.out.println(it1+"�� ������ "+it1.price);
		
		Item it2 = new MixNoodle();
		System.out.println(it2+"�� ������ "+it2.price);
		
		Item it3 = new Woodong();
		System.out.println(it3+"�� ������ "+it3.price);
		
		System.out.println("====�ֹ��� �޴��� ������ ����ϰ� ���� �� ���====");
		Buyer buyer = new Buyer(20000);
		buyer.buy(new Noodle(), 2);
		buyer.buy(new MixNoodle(), 1);
	}

}
