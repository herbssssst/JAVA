package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex08Week14 {

	public static void main(String[] args)throws IOException 
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JAVA_B\\buffer.txt"));
		bw.write("자바의 버퍼를 연습 중 입니다.");
		bw.newLine();
		bw.write("마지막 종강입니다");
		bw.newLine();
		bw.newLine();
		bw.write("기말고사 잘 보세요");
		bw.newLine();
		System.out.println("버퍼의 쓰기가 완료되었습니다.");
		bw.close();
	}

}
