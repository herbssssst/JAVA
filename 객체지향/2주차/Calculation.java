
import java.util.Scanner;

public class Calculation 
{	
	void mymain() 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 두 개를 입력하시오 >> ");
		
		int num1 = scanner.nextInt(); // 첫번째 정수 변수 선언
		int num2 = scanner.nextInt(); // 두번째 정수 변수 선언
		
		System.out.print("연산자(+, -, *, /)를 입력하시오 >> ");
		String operator = scanner.next(); // 연산자 변수 선언
		
		String outline = "실행결과 >> "+num1 + operator + num2+" = ";
		int result=0;
		
		switch(operator)
		{
			case "+":
				result = num1+num2;
				break;
			case "-":
				result = num1-num2;
				break;
			case "*":
				result = num1*num2;
				break;
			case "/":
				result = num1/num2;
				break;
			default :
				System.out.println("잘못된 연산식입니다. "+"연산자(+, -, *, /) 확인 후 다시 시도해주세요.");
		}
		scanner.close();
		System.out.println(outline+result);
	}

	public static void main(String[] args) 
	{
		Calculation c = new Calculation();
		c.mymain();
	}
}