import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args)
	{
		System.out.println("3개의 정수 입력 :");
		
		Scanner in = new Scanner(System.in);
		int su1 = in.nextInt();
		int su2 = in.nextInt();
		int su3 = in.nextInt();
		int max;
		
		if(su1>su2)
			max=(su1>su3)?su1:su3;
		else
			max=(su2<su3)?su2:su3;
		
		/*if(su1>su2)
		{
			if(su1>su3)
				max=su1;
			else
				max=su3;
		}
		else
		{
			if(su2>su3)
				max=su2;
			else
				max=su3;
		}*/
		System.out.println(max);
			
		/*if(su1 > su2)
		{
			if(su1 > su3)
				System.out.println(su1);
			else
				System.out.println(su3);
		}
		else
		{
			if(su2 > su3)
				System.out.println(su2);
			else
				System.out.println(su3);
		}*/
	}

}
