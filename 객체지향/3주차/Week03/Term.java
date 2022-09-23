package Week03;

import java.util.Scanner;

class Term {
	public int coeff;
	public int exponent;
	
	Term(int c, int e) {  // ������
		coeff = c;
		exponent = e;
	}
	
	void read(Scanner scan) {
		coeff = scan.nextInt();
		exponent = scan.nextInt();
	}
	// ���� c x ^ e ���·� ���
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

	// x�� ���� �޾� ���� ����� ����� ��ȯ
	int calc(int x) {
		return (int)(coeff * Math.pow(x, exponent));
	}

	// ������ ���Ͽ� exponent�� e�� ������ true,  �ƴϸ� false (compare�� �����ص� ��)
	boolean equals(int e) {
		if(exponent == e)
			return true;
		
		return false;
	}

	 // ������ ���Ͽ� exponent�� �� ũ�� 1, ������ 0, ������ -1 ��ȯ
	int compare(int e) { 
		if(exponent > e)
			return 1;
		else if(exponent == e)
			return 0;
		else 
			return -1;
	}

	 // ������ ���� ���� ����� �޾� coeff�� ���Ѵ�
	void add(int c) {
		coeff += c;
	}
}
