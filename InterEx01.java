interface Printable //�������̽��� Ŭ�������� Ư���Ͽ� interface��� ���� ���
{ 
	//�ƹ��͵� ���� �Ǿ����� ���� ������Ÿ�� �޼ҵ�θ� �����Ǿ� ����
	public void print();
}
interface Drawable
{
	public void draw();
}
//�ڹٴ� �⺻������ ���� ����� ��� X, �� �������̽��� �����ϰ� ���߻�� ����
class Shape1 implements Printable, Drawable
{
	//�������̽��� ��� ���� Ŭ������ �ݵ�� ������Ÿ�� �޼ҵ带 �����ؾ���
	public void print()
	{
		System.out.println("������ �����ͷ� ���");
	}
	public void draw()
	{
		System.out.println("������ ȭ�鿡 ����մϴ�");
	}
}
public class InterEx01 {
	public static void main(String[] args) 
	{
		//interface�� �ڱ��ڽ��� ��üȭ �� �� ����
		Shape1 s = new Shape1();
		s.print();
		s.draw();
	}

}
