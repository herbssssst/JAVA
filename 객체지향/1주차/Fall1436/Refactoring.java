package Fall1436;

import java.util.Scanner;

public class Refactoring 
{
	Scanner in = new Scanner(System.in);
	
	int num = in.nextInt();
	int count = 0 ;
	int result = 0;
	
	void mymain()
	{	
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
	
	public static void main(String[] args) 
	{
		Refactoring code = new Refactoring();
		code.mymain();
	}
}
