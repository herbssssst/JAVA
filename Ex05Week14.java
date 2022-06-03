package com.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05Week14 {

	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream out = new FileOutputStream("C:\\JAVA_B\\out.txt");
			String str = "이 파일을 파일문서로 기록하겠습니다.";
			byte[] buf = str.getBytes();
			out.write(buf);
			out.close();
			System.out.println("파일쓰기가 완료되었습니다.");
			//out.write(str);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
