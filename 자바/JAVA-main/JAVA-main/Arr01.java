
class Circle
{
	int r; //�������
	
	public Circle(int r) //�޼ҵ�
	{
		this.r = r;
	}
	public double getArea() //���� ���� ��ȯ �޼ҵ�
	{
		return r*r*3.14;
	}
}
public class Arr01 {

	public static void main(String[] args) 
	{
		Circle[] c = new Circle[5];
		for(int i=0; i<c.length; i++)
		{
			c[i] = new Circle(i+1); //������ 1���� 5���� ����
		}
		for(Circle obj:c)
			System.out.println(obj.getArea());
	}

}

/*import java.util.ArrayList;
 * ArrayList<String> s = new ArrayList<String>();
		
		s.add("���");
		s.add("����");
		s.add("����");
		
		for(String list:s)
			System.out.println(list);*/

