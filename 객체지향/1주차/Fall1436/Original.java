package Fall1436;

import java.util.Scanner;

public class Original {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 0 ;
		int result = 0;
		
		while(true)
		{
			result++; //result�� count�� num�� ������ ������ ����
			String string = Integer.toString(result); //int�� string���� ����ȯ
			
			if(string.contains("666")) //string�� 666�� �ִ��� Ȯ��, ������ count ����
			{
				count++;
			}
			
			if(count == num)
			{
				break;
			}
		}
		System.out.println(result);
	}
}
