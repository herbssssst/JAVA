package com.collect;

import java.util.Vector;

public class Ex01Week14 {

	public static void main(String[] args) 
	{
		Vector<Integer> v =  new Vector<Integer>();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println("백터의 요소 길이 : "+v.size());
		
		for(Integer vec : v)
			System.out.print(vec+" ");
		System.out.println("");
		v.remove(1);
		
		for(int i=0; i<v.size(); i++)
			System.out.print(v.get(i)+" ");
		System.out.println("");
		
		int sum=0;
		for(int i=0; i<v.size(); i++)
			sum = sum+v.get(i);
		System.out.println("벡터에 저장된 합은 : "+sum);
		
		

	}

}
