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
			result++; //result가 count와 num과 같아질 때까지 증가
			String string = Integer.toString(result); //int를 string으로 형변환
			
			if(string.contains("666")) //string에 666이 있는지 확인, 있으면 count 증가
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
