import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 :");
		int su = input.nextInt();
		
		
		switch(su/10)
		{
			case 10:
			case 9:
				System.out.println("A입니다");
				break;
			case 8:
				System.out.println("B입니다");
				break;
			case 7:
				System.out.println("C입니다");
				break;
			case 6:
				System.out.println("D입니다");
				break;
			default :
				System.out.println("F입니다");
				break;
		}
		/*switch(su)
		{
			case 2:
				System.out.println("월의 날수는 28");
				break;
			case 4:  //4 6 9 11
			case 6:
			case 9:
			case 11:
				System.out.println("월의 날수는 30");
				break;
			default : //1 3 5 7 8 10 12
				System.out.println("월의 날수는 31");
				break;
		}*/
		/*System.out.println("1~3까지의 수를 입력");
		int su = input.nextInt();
		
		switch(su)
		{
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("경우의 없는 수");
				break;
		}*/
	}

}
