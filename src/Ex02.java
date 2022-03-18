import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("오렌지의 개수를 입력하시오 : ");
		int orange = in.nextInt();
		
		int box = orange/10;
		int result = box % 10;
		
		System.out.println("박스의 개수는 :"+box+" 남은 오렌지 개수는:"+result);

	}

}
