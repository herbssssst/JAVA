package com.io;

import java.io.FileReader;
import java.io.IOException;

public class Ex06Week14 {

	public static void main(String[] args) 
	{
		try 
		{ //reader�� �ѱ��� ������ �ʰ� ������ �� ����
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
