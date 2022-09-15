package Polynomial;

import java.util.ArrayList;
import java.util.Scanner;

class Polynomial {
	// 다항식의 항을 가지는 리스트
	ArrayList<Term> termArray = new ArrayList<>();
	char name; // 다항식의 이름

	// 입력에서 다항식의 이름과 계수, 지수를 받아 이름 저장 및 항을 하나 생성
	// 입력: f 3 4
	void read(Scanner scan) 
	{
	}
	// 이 다항식을 f = 3 x ^ 4 + 2 x + 6 형태로 출력
	void print() 
	{
	}
	// x의 값을 받아 다항식을 계산한 결과를 반환
	int calc(int x) 
	{
	}
	// 항을 하나 입력받아 이 다항식에 내림차순으로 더한다
	void add(Scanner scan) 
	{
	}
	// 항을 추가하거나 항을 찾는 함수 private
	private void addTerm(int c, int e) 
	{
	}
	private Term findTerm(int e) 
	{
	}
}
