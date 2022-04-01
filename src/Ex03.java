import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) 
	{
		//1. 5개의 정수를 입력받아 배열에 저장하고 합과 평균을 구하세요
		//2. 5개의 정수를 입력받아 배열에 저장하고 입력받은 정수 중 최대값 최솟값 출력
		Scanner in = new Scanner(System.in);
		int [] num = new int[5];
		int sum=0;

		System.out.print("5개의 정수를 입력 :");
		for(int i=0; i<5; i++)
		{
			num[i] = in.nextInt();
			sum += num[i];
		}
		double avg = (double)sum / num.length;
		System.out.println("합 :"+sum);
		System.out.println("평균 :"+avg);

		int max=num[0], min=num[0]; //문제 2
		for(int i=0; i<num.length; i++)
		{
			if(max<num[i])
				max = num[i];

			if(min>num[i])
				min = num[i];

		}
		System.out.println("최대값 : "+max);
		System.out.println("최솟값 : "+min);
	}

}
