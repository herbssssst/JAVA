package com.collect; 
import java.util.HashMap;
import java.util.Scanner;

//���� ���� Ȯ�� ����
public class HashEx01 {
	public static void main(String[] args) 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("baby", "�Ʊ�"); 
		map.put("love", "���");
		map.put("apple", "���");
		
		//���� �ܾ �Է��ϸ� �� ������ �ѱ�� ���(exit �Է� ������ �ݺ��� ����)
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.print("ã�� �ܾ� �Է� : ");
			String eng = in.nextLine();
			if(eng.equals("exit"))
				break;
			
			//Key�� �ؽøʿ� ���ԵǴ� ��ġ ����, ���� �������� ���ؼ��� Ű�� ����ؾ� ��
			//�տ��� ��� get()�� �뵵�� �ٸ� >> Hashmap : Ű�� �ش��ϴ� ���� ������
			String kor = map.get(eng);
			if(kor==null)
				System.out.println("����� ã�� �ܾ� "+eng+"�� �����ϴ�.");
			else
				System.out.println(kor);
		}
	}
}
