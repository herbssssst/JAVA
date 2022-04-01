import java.util.Scanner;

public class Excep01 {

	public static void main(String[] args) 
	{
		int x,y,result;
		Scanner in = new Scanner(System.in);
		
		System.out.print("피제수입력");
		x=in.nextInt();
		System.out.print("제수입력");
		y=in.nextInt();
		
		try 
		{
			result=x/y;
			System.out.print("나눈 결과 값은 : "+result);
		}
		catch(ArithmeticException e) //Exception e
		{
			System.out.println("0으로 나눌 수 없습니다");
		}
		finally //finally 생략가능
		{
			System.out.println("프로그램 종료");
		}
	}

}
