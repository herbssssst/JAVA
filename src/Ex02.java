import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("정수 입력 :");
			int a=in.nextInt();
			
			if(a==0) break;
			else if(a%2!=0)
				System.out.println("홀수입니다");
			else
				System.out.println("짝수입니다");
				
		}
		/*int sum=0;
		System.out.print("5개의 정수 입력 :");
		for(int i=0; i<5; i++)
		{
			int a=in.nextInt();
			
			if(a>=0) sum += a;
			else continue;
		}
		System.out.print(sum);*/
	}

}
