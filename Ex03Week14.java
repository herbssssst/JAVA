package com.io;

import java.io.FileInputStream;
import java.io.IOException;
// !!! ��ü�ڵ�, �� �ܿ��� �߿� !!!
public class Ex03Week14 {
	public static void main(String[] args) 
	{	//�ѱ��� 2����Ʈ, ����Ʈ�� 1����Ʈ ������
		//�б�
		try 
		{
			// �������� 2�� �����
			FileInputStream in = new FileInputStream("C:\\JAVA_B\\input.txt");
			int c; //��ȯ���� int �̱� ������, ������ int
			while((c=in.read())!=-1)
			{ //����Ʈ �������� �� �ܾ ����
				System.out.print((char)c); //char ���� ����ȯ >> �� �ϸ� ���ڷ� ����
			}
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
