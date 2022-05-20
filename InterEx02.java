interface Flying
{
	public void fly();
}
interface Driving
{
	public default void speed()
	{
		//인터페이스에 정의 되어 있는 메소드를 사용하고 싶으면 default 예약어 사용
		System.out.println("고속도로에서 100km 로 자율주행이 설정되었습니다");
	}
	public void drive();
}
class Car
{
	public void Setspeed(int speed)
	{
		System.out.println("자동차의 속도가 "+speed+" k/m로 바뀝니다");
	}
}
class FlyCar extends Car implements Flying, Driving
{
	public void fly()
	{
		System.out.println("자동차가 날고 있습니다.");
	}
	public void drive()
	{
		System.out.println("자동차가 달리고 있습니다.");
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
