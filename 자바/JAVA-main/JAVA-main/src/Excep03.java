import java.util.Scanner;

public class Excep03 {

	public static void main(String[] args) 
	{
		//main함수 throw 
		int sum=0, n=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("3개의 정수 입력");
		
		for(int i=1; i<=3; i++)
		{
			try
			{
				n=in.nextInt();
			} 
			catch (Exception e) 
			{
				in.next(); //next 지울 수 있음
				i--;
				continue;
			}
			sum += n;
		}
		System.out.print("입력받은 수의 합은 :"+sum);
	}
}
