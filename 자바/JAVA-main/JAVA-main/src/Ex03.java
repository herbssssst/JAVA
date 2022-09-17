//������ ����
class Circle
{
	double radius;
	String name;
	
	public double getArea()
	{
		return radius*radius*3.14;
	}
	//�ʱ�ȭ�� �������� ������ ����
	//1. Ŭ������ �̸����� 2. ��ȯ���°� ���� Ư�� �޼ҵ�
	public Circle()
	{
		name="��";
		radius=1.0;
	}
	public Circle(String n, double r) //������, void �� �ָ� �Լ��� �� ���� void ����
	{
		name = n;
		radius = r;
	}
	//3. �Ȱ��� �̸��� �����ڴ� ������ �� �� �ִ�. (��, �Ű������� ������ �ٸ��ų� Ÿ���� �޶�� ��)
	public Circle(String n)
	{
		name = n;
	}
	public Circle(double r)
	{
		radius = r;
	}
	public void print()
	{
		System.out.println(name+"�� ������ "+getArea());
	}
}

public class Ex03 {

	public static void main(String[] args) 
	{
		 
		Circle c1 = new Circle("����", 10.0);
		Circle c2 = new Circle("����"); //���̴� 0 >> ���ڴ� �ʱ�ȭ ��Ű�� ������ 0 ����
		Circle c3 = new Circle(5.0); //�̸� Null >> �ʱ�ȭ ��Ű�� �ʴ� ���ڴ� Null ����
		Circle c4 = new Circle(); //�����ڰ� �ϳ��� ������ ����Ʈ������ ��� ����, ������ ���� ������ ����
		c1.print();
		c2.print();
		c3.print();
	}

}
/*
public Student(String hak, String name, int ag)
{
	this.hakbun = hak; //this : �ڱ� �ڽ��� ����Ű�� ���۷���
	this.name = name; //���� �̸��� ������ ������ �� ������ ���! 
	this.age=ag;
}
*/
