import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("���� �Է� :");
			int a=in.nextInt();
			
			if(a==0) break;
			else if(a%2!=0)
				System.out.println("Ȧ���Դϴ�");
			else
				System.out.println("¦���Դϴ�");
				
		}
		/*int sum=0;
		System.out.print("5���� ���� �Է� :");
		for(int i=0; i<5; i++)
		{
			int a=in.nextInt();
			
			if(a>=0) sum += a;
			else continue;
		}
		System.out.print(sum);*/
	}

}
