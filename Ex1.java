class MathTest
{
	//�޼ҵ� �����ε� : Ŭ���� �ȿ� �Ȱ��� �̸��� �Լ��� ������ �������
	public int getSum(int x, int y)
	{
		return x+y;
	}
	public int getSum(int x, int y, int z) //��Ģ 1 : �Ű������� ������ �ٸ�
	{
		return x+y+z;
	}
	public double getSum(double x, double y) //��Ģ 2 : Ÿ������ �޶�� ��
	{
		return x+y;
	}
}
public class Ex1 {

	public static void main(String[] args) 
	{
		MathTest test = new MathTest();
		System.out.println(test.getSum(10,20)); //30
		System.out.println(test.getSum(10,20,30)); //60
		System.out.println(test.getSum(10.0,20.0)); //30.0

	}

}
