package com.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05Week14 {

	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream out = new FileOutputStream("C:\\JAVA_B\\out.txt");
			String str = "�� ������ ���Ϲ����� ����ϰڽ��ϴ�.";
			byte[] buf = str.getBytes();
			out.write(buf);
			out.close();
			System.out.println("���Ͼ��Ⱑ �Ϸ�Ǿ����ϴ�.");
			//out.write(str);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
