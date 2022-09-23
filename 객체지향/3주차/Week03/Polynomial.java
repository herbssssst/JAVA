package Week03;

import java.util.ArrayList;
import java.util.Scanner;

class Polynomial {
	// ���׽��� ���� ������ ����Ʈ
	ArrayList<Term> termArray = new ArrayList<>();
	char name; // ���׽��� �̸�
	Term term = null;
	
	// �Է¿��� ���׽��� �̸��� ���, ������ �޾� �̸� ���� �� ���� �ϳ� ����
	// �Է�: f 3 4
	void read(Scanner scan) {
		term = new Term(0, 0);
		name = scan.next().charAt(0);
		term.read(scan);
		termArray.add(term);
	}

	// �� ���׽��� f = 3 x ^ 4 + 2 x + 6 ���·� ���
	void print() {
		System.out.print(name+"(x) = ");
		for(Term t : termArray)
		{
			t.print();
		}
		System.out.println("0");
	}

	// x�� ���� �޾� ���׽��� ����� ����� ��ȯ
	void calc(int x) {
        int result = 0;
        for (Term t : termArray) {
            result += t.calc(x);
        }
        System.out.format("%c(%d) = %d\n", name, x, result);
    }

	// ���� �ϳ� �Է¹޾� �� ���׽Ŀ� ������������ ���Ѵ�. ���� ����� ������ �Է���
	void add(Scanner scan) {
		term = new Term(0, 0);
		term.read(scan);
		addTerm(term.coeff, term.exponent);
	}

	// ���� �߰��ϰų� ���� ã�� �Լ� private
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