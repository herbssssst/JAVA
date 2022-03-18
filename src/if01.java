import java.util.Scanner;

public class if01 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("수 하나 입력");
		int su = input.nextInt();
		
		if(su>=90)
			System.out.println("A입니다");
		else if(su>=80)
			System.out.println("B입니다");
		else if(su>=70)
			System.out.println("C입니다");
		else
			System.out.println("D입니다");
		
		/*if(su%2==0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");*/
		
		/*if(su>0)
			System.out.println("양수");
		else if(su==0)
			System.out.println("0입니다");
		else 
			System.out.println("음수");*/
	}

}
