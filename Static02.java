import java.util.ArrayList;
import java.util.Scanner;

class Car
{
	private String model;
	private String color;
	private int price;
	static int number;
	
	public Car(String model, String color, int price)
	{
		this.model=model;
		this.color=color;
		this.price=price;
		number++;
	}
	public String toString()
	{
		return model+"�� ���� "+color+"(���� : "+price+")";
	}
}
public class Static02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Car> car = new ArrayList<Car>();
		//Car c[] = new Car[3];
		for(int i=0; i<3; i++)
		{
			System.out.print("������ ����, ������ �Է��Ͻÿ� : ");
			String model = in.next();
			String color = in.next();
			int price = in.nextInt();
			
			car.add(new Car(model, color, price));
			//c[i] = new Car(model, color, price);
		}
		System.out.println("�ȸ� �ڵ��� ���� : "+Car.number);
		for(Car c : car)
			System.out.println(c);

	}

}
