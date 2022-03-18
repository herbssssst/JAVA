import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("두개의 정수 입력(공백으로 구별)");
		int a=input.nextInt();
		int b=input.nextInt();
		
		int result =(a>b)?a-b:b-a;
		System.out.println("두개의 정수의 차는 : "+result);
	}
}
