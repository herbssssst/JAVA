import java.util.Scanner;

public class Excep01 {

	public static void main(String[] args) 
	{
		int x,y,result;
		Scanner in = new Scanner(System.in);
		
		System.out.print("�������Է�");
		x=in.nextInt();
		System.out.print("�����Է�");
		y=in.nextInt();
		
		try 
		{
			result=x/y;
			System.out.print("���� ��� ���� : "+result);
		}
		catch(ArithmeticException e) //Exception e
		{
			System.out.println("0���� ���� �� �����ϴ�");
		}
		finally //finally ��������
		{
			System.out.println("���α׷� ����");
		}
	}

}
