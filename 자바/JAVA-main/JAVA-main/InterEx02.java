interface Flying
{
	public void fly();
}
interface Driving
{
	public default void speed()
	{
		//�������̽��� ���� �Ǿ� �ִ� �޼ҵ带 ����ϰ� ������ default ����� ���
		System.out.println("��ӵ��ο��� 100km �� ���������� �����Ǿ����ϴ�");
	}
	public void drive();
}
class Car
{
	public void Setspeed(int speed)
	{
		System.out.println("�ڵ����� �ӵ��� "+speed+" k/m�� �ٲ�ϴ�");
	}
}
class FlyCar extends Car implements Flying, Driving
{
	public void fly()
	{
		System.out.println("�ڵ����� ���� �ֽ��ϴ�.");
	}
	public void drive()
	{
		System.out.println("�ڵ����� �޸��� �ֽ��ϴ�.");
	}
}
public class InterEx02 {
	public static void main(String[] args) 
	{
		FlyCar car = new FlyCar();
		car.speed();
		car.Setspeed(60);
		car.fly();
		car.drive();
	}

}
