package com.io;

import java.io.FileInputStream;
import java.io.IOException;
// !!! 전체코딩, 다 외워라 중요 !!!
public class Ex03Week14 {
	public static void main(String[] args) 
	{	//한글은 2바이트, 바이트는 1바이트 단위로
		//읽기
		try 
		{
			// 역슬래시 2개 써야함
			FileInputStream in = new FileInputStream("C:\\JAVA_B\\input.txt");
			int c; //반환형이 int 이기 때문에, 무조건 int
			while((c=in.read())!=-1)
			{ //바이트 단위여서 한 단어씩 나옴
				System.out.print((char)c); //char 강제 형변환 >> 안 하면 숫자로 나옴
			}
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
