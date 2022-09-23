package Week03;

import java.util.Scanner;

class Term {
	public int coeff;
	public int exponent;
	
	Term(int c, int e) {  // 생성자
		coeff = c;
		exponent = e;
	}
	
	void read(Scanner scan) {
		coeff = scan.nextInt();
		exponent = scan.nextInt();
	}
	// 항을 c x ^ e 형태로 출력
	void print() {
	if(coeff == 1)
	{
		if(exponent == 1)
			System.out.print(" x + ");
		else if(exponent == 0)
			System.out.print(coeff+" + ");
		else
			System.out.print(" x ^ "+exponent+" + ");
	}
	else if(exponent == 1)
		System.out.print(coeff+" x + ");
	else if(exponent == 0)
		System.out.print(coeff+" + ");
	else
		System.out.print(coeff+" x ^ "+exponent+" + ");
	}

	// x의 값을 받아 항을 계산한 결과를 반환
	int calc(int x) {
		return (int)(coeff * Math.pow(x, exponent));
	}

	// 지수를 비교하여 exponent가 e와 같으면 true,  아니면 false (compare로 통일해도 됨)
	boolean equals(int e) {
		if(exponent == e)
			return true;
		
		return false;
	}

	 // 지수를 비교하여 exponent가 더 크면 1, 같으면 0, 작으면 -1 반환
	int compare(int e) { 
		if(exponent > e)
			return 1;
		else if(exponent == e)
			return 0;
		else 
			return -1;
	}

	 // 지수가 같은 항의 계수를 받아 coeff에 더한다
	void add(int c) {
		coeff += c;
	}
}
