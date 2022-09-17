package com.app;
import com.lib.*;

public class GoodCalc extends Calculator 
{
	@Override
	public int add(int a, int b) 
	{
		return a+b;
	}

	@Override
	public int minus(int a, int b)
	{
		return a-b;
	}

	@Override
	public double avg(int[] a) 
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
			sum = sum+a[i];
		return sum/a.length;
	}

	public static void main(String[] args)
	{
		GoodCalc c1 = new GoodCalc();
		System.out.println(c1.add(10, 20));
		System.out.println(c1.minus(100,50));
		System.out.println(c1.avg(new int[] {10,5,7,8,20,6}));

		System.out.println("객체의 이름 : "+c1.getClass().getName());
		System.out.println("해시코드 값 : "+c1.hashCode());
		System.out.println(c1.toString());
	}
}
