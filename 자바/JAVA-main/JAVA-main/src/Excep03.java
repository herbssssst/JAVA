import java.util.Scanner;

public class Excep03 {

	public static void main(String[] args) 
	{
		//main�Լ� throw 
		int sum=0, n=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("3���� ���� �Է�");
		
		for(int i=1; i<=3; i++)
		{
			try
			{
				n=in.nextInt();
			} 
			catch (Exception e) 
			{
				in.next(); //next ���� �� ����
				i--;
				continue;
			}
			sum += n;
		}
		System.out.print("�Է¹��� ���� ���� :"+sum);
	}
}
