import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�ΰ��� ���� �Է�(�������� ����)");
		int a=input.nextInt();
		int b=input.nextInt();
		
		int result =(a>b)?a-b:b-a;
		System.out.println("�ΰ��� ������ ���� : "+result);
	}
}
