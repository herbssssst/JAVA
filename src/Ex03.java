import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) 
	{
		//1. 5���� ������ �Է¹޾� �迭�� �����ϰ� �հ� ����� ���ϼ���
		//2. 5���� ������ �Է¹޾� �迭�� �����ϰ� �Է¹��� ���� �� �ִ밪 �ּڰ� ���
		Scanner in = new Scanner(System.in);
		int [] num = new int[5];
		int sum=0;
		
		System.out.print("5���� ������ �Է� :");
		for(int i=0; i<5; i++)
		{
			num[i] = in.nextInt();
			sum += num[i];
		}
		double avg = (double)sum / num.length;
		System.out.println("�� :"+sum);
		System.out.print("��� :"+avg);
				
		int max=num[0], min=num[0]; //���� 2
		for(int i=0; i<num.length; i++)
		{
			if(max<num[i])
				max = num[i];
			
			if(min>num[i])
				min = num[i];
			
		}
		System.out.println(max);
	}

}
