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
		//3명 학생 추가
		map.put("홍길동", new Student(1, "010-1111-1234")); //빈칸 코딩 낼 수도 있음
		map.put("김영철", new Student(2, "010-2222-1234")); 
		map.put("이영희", new Student(3, "010-3333-1234")); 
			
		//찾고자하는 사람의 이름을 입력 받아 그 사람의 전화번호를 출력
		//만약에 exit를 만나면 입력 받는 걸 종료
		while(true)
		{
			System.out.print("찾고자 하는 학생의 이름 입력 : ");
			String name = in.nextLine();
			
			if(name.equals("exit"))
				break;
				
			Student s = map.get(name);
			if(s==null)
				System.out.println(name+"학생의 정보 없음");
			else
				System.out.println(s.getTel());
		}
	}
}
