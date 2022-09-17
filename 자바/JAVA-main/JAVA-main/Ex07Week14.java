package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//중요하다 전체 코딩
public class Ex07Week14 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("C:\\JAVA_B\\input.txt"));
		String str;
		while(true)
		{
			str=in.readLine();
			if(str==null) 
				break;
			System.out.println(str);
		}

	}

}
