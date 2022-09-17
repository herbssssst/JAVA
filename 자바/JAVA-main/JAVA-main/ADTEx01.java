abstract class Shape
{
	public abstract void draw();
	public abstract void Area(double a, double b);
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("���� �׸��� ���");
	}
	public void Area(double a, double b)
	{
		System.out.println("���� ���̴� :"+(3.14*a*b));
	}
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("�ﰢ���� �׸��� ���");
	}
	public void Area(double a, double b)
	{
		System.out.println("�ﰢ���� ���̴� :"+(a*b)/2);
	}
}
class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("�簢���� �׸��� ���");
	}
	public void Area(double a, double b)
	{
		System.out.println("�簢���� ���̴� :"+(a*b));
	}
}
public class ADTEx01 
{
	public static void main(String[] args)
	{
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		Shape s3 = new Triangle();
		//Shape[] shape = {new Circle(), new Rectangle(), Triangle()};
		Shape[] shape = {s1, s2, s3};
		
		for(Shape list: shape)
		{
			list.draw();
			list.Area(5.0, 5.0);
		}
	}
}
