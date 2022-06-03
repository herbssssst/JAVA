package com.collect; 
import java.util.HashMap;
import java.util.Scanner;

//시험 나올 확률 높음
public class HashEx01 {
	public static void main(String[] args) 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("baby", "아기"); 
		map.put("love", "사랑");
		map.put("apple", "사과");
		
		//영어 단어를 입력하면 그 번역된 한국어를 출력(exit 입력 받으면 반복문 종료)
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.print("찾을 단어 입력 : ");
			String eng = in.nextLine();
			if(eng.equals("exit"))
				break;
			
			//Key는 해시맵에 삽입되는 위치 결정, 값을 가져오기 위해서는 키를 사용해야 함
			//앞에서 썼던 get()의 용도가 다름 >> Hashmap : 키에 해당하는 값을 가져옴
			String kor = map.get(eng);
			if(kor==null)
				System.out.println("당신이 찾는 단어 "+eng+"는 없습니다.");
			else
				System.out.println(kor);
		}
	}
}
