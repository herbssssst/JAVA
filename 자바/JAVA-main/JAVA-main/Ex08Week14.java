package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex08Week14 {

	public static void main(String[] args)throws IOException 
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JAVA_B\\buffer.txt"));
		bw.write("�ڹ��� ���۸� ���� �� �Դϴ�.");
		bw.newLine();
		bw.write("������ �����Դϴ�");
		bw.newLine();
		bw.newLine();
		bw.write("�⸻��� �� ������");
		bw.newLine();
		System.out.println("������ ���Ⱑ �Ϸ�Ǿ����ϴ�.");
		bw.close();
	}

}
