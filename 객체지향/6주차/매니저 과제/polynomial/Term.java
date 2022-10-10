package polynomial;

import java.util.Scanner;

class Term {
	public int coef;
	public int expo;
	Term(int c, int e) {
		coef = c;
		expo = e;
	}
	void read(Scanner scan) {
		coef = scan.nextInt();
		expo = scan.nextInt();
	}
	// ���� c x ^ e ���·� ���
	void print() {
		if (expo == 0) {
			System.out.print(coef);
			return;
		}
		System.out.format(" %d x ^ %d ", coef, expo);
	}
	// x�� ���� �޾� ���� ����� ����� ��ȯ
	int calc(int x) {
		return coef * (int) (Math.pow(x, expo));
	}
	// ������ ���Ͽ� exponent�� e�� ������ true,  �ƴϸ� false (compare�� �����ص� ��)
	boolean equals(int e) {
		return compare(e) == 0;
	}
	 // ������ ���Ͽ� exponent�� �� ũ�� 1, ������ 0, ������ -1 ��ȯ
	int compare(int e) { 
		return expo - e;
	}
	 // ������ ���� ���� ����� �޾� coeff�� ���Ѵ�
	void add(int c) {
		coef += c;
	}
}