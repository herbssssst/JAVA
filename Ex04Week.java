package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04Week {

	public static void main(String[] args) 
	{
		try 
		{
			//FileInputStream in = new FileInputStream("C:\\JAVA_B\\out.txt");
			//FileOutputStream out = new FileOutputStream("C:\\JAVA_B\\comcopy.txt");
			FileInputStream in = new FileInputStream("C:\\JAVA_B\\com.png");
			FileOutputStream out = new FileOutputStream("C:\\JAVA_B\\comcopy.png");
			int c;
			while((c=in.read())!=-1)
				out.write(c);
			System.out.println("파일이 복사되었습니다");
			out.close();
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
