package Polynomial;

class Term {
	public int coeff;
	public int exponent;
	Term(int coeff, int exponent) 
	{  // 생성자
		this.coeff = coeff;
		this.exponent = exponent;
	}
	// 항을 c x ^ e 형태로 출력
	void print() 
	{
		
	}
	// x의 값을 받아 항을 계산한 결과를 반환
	int calc(int x) 
	{
		
	}
	// 지수를 비교하여 exponent가 e와 같으면 true,  아니면 false
	boolean equals(int exponent) 
	{
	}
	 // 지수를 비교하여 exponent가 더 크면 1, 같으면 0, 작으면 -1 반환
	int compare(int exponent) 
	{ 
	}
	 // 지수가 같은 항의 계수를 받아 coeff에 더한다
	void add(int c) {
	} 
}