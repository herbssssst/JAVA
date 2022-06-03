package com.io;

import java.io.FileReader;
import java.io.IOException;

public class Ex06Week14 {

	public static void main(String[] args) 
	{
		try 
		{ //reader는 한글을 깨지지 않게 가져올 수 있음
			FileReader in = new FileReader("C:\\JAVA_B\\out.txt");
			int i;
			while((i=in.read())!=-1)
				System.out.print((char)i);
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
