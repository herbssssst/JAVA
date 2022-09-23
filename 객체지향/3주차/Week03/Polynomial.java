package Week03;

import java.util.ArrayList;
import java.util.Scanner;

class Polynomial {
	// 다항식의 항을 가지는 리스트
	ArrayList<Term> termArray = new ArrayList<>();
	char name; // 다항식의 이름
	Term term = null;
	
	// 입력에서 다항식의 이름과 계수, 지수를 받아 이름 저장 및 항을 하나 생성
	// 입력: f 3 4
	void read(Scanner scan) {
		term = new Term(0, 0);
		name = scan.next().charAt(0);
		term.read(scan);
		termArray.add(term);
	}

	// 이 다항식을 f = 3 x ^ 4 + 2 x + 6 형태로 출력
	void print() {
		System.out.print(name+"(x) = ");
		for(Term t : termArray)
		{
			t.print();
		}
		System.out.println("0");
	}

	// x의 값을 받아 다항식을 계산한 결과를 반환
	void calc(int x) {
        int result = 0;
        for (Term t : termArray) {
            result += t.calc(x);
        }
        System.out.format("%c(%d) = %d\n", name, x, result);
    }

	// 항을 하나 입력받아 이 다항식에 내림차순으로 더한다. 항은 계수와 지수를 입력함
	void add(Scanner scan) {
		term = new Term(0, 0);
		term.read(scan);
		addTerm(term.coeff, term.exponent);
	}

	// 항을 추가하거나 항을 찾는 함수 private
	private void addTerm(int c, int e) {
		Term index = findTerm(e);
		Term t = new Term(c, e);
		
		if(index != null) {
			index.add(c);	
		}
		else {
			int length = termArray.size()-1;

			for(int i = 0; i <= length; i++)
			{
				if(termArray.get(i).exponent<t.exponent)
				{
					termArray.add(i, t);
					break;
				}
				else if(i == length) 
				{
					termArray.add(t);
				}
			}
		}
	}
	
	private Term findTerm(int e) {
		for(Term t : termArray)
		{
			if(t.equals(e))
				return t;
		}
		return null;
	}
}