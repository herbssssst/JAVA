//Ŭ���� student����
//���� : ������� : �й�, �̸�, �г�
//���� : ��� �޼ҵ�(�й� : �̸� �� �г��� ~ �Դϴ�.)
/*public void print()
 * {
 * System.out.println(hakvun+";");
 * }
 */
//��ü 2�� �����Ͽ� �� Ŭ������ ���� Ư¡ ���
class Circle //�� ���赵
{
	//����(�������): �̸��� ������
	String name; //�Ӽ�
	double r;
	
	//����(�޼ҵ�) : ���� ������ ��ȯ���ִ� �޼ҵ�
	double getArea() //�����ִ� �Լ� �̸��� get, �޾ƿ� �� set, ������ ���
	{
		return r*r*3.14;
	}
}
public class C01 {

	public static void main(String[] args)
	{
		Circle p = new Circle(); //��ü
		p.name="����"; //��ü.�Ӽ�=" " >>�� �ο�
		p.r=10.0;
		
		double area=p.getArea();
		System.out.println(p.name+" �� ������ :"+area);
		
		Circle d= new Circle();
		d.name="����";
		d.r=2.0;
		System.out.println(d.name+" �� ������ :"+d.getArea());
		
	}
}

