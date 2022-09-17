package com.collect;

import java.util.HashMap;
import java.util.Scanner;

class Student
{
	private int id;
	private String tel;
	public Student(int id, String tel)
	{
		this.id = id;
		this.tel = tel;
	}
	public int getId() 
	{
		return id;
	}
	public String getTel() 
	{
		return tel;
	}
}
public class HashEx02 {
	public static void main(String[] args) 
	{
		HashMap<String, Student> map = new HashMap<String, Student>();
		Scanner in = new Scanner(System.in);
		//3�� �л� �߰�
		map.put("ȫ�浿", new Student(1, "010-1111-1234")); //��ĭ �ڵ� �� ���� ����
		map.put("�迵ö", new Student(2, "010-2222-1234")); 
		map.put("�̿���", new Student(3, "010-3333-1234")); 
			
		//ã�����ϴ� ����� �̸��� �Է� �޾� �� ����� ��ȭ��ȣ�� ���
		//���࿡ exit�� ������ �Է� �޴� �� ����
		while(true)
		{
			System.out.print("ã���� �ϴ� �л��� �̸� �Է� : ");
			String name = in.nextLine();
			
			if(name.equals("exit"))
				break;
				
			Student s = map.get(name);
			if(s==null)
				System.out.println(name+"�л��� ���� ����");
			else
				System.out.println(s.getTel());
		}
	}
}
