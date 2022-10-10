package polynomial;

import java.util.ArrayList;
import java.util.Scanner;

class Polynomial implements Manageable{
	// ���׽��� ���� ������ ����Ʈ
	ArrayList<Term> terms = new ArrayList<>();
	char name; // ���׽��� �̸�

	// �Է¿��� ���׽��� �̸��� ���, ������ �޾� �̸� ���� �� ���� �ϳ� ����
	// �Է�: f 3 4
	@Override
	public void read(Scanner scan) {
		name = scan.next().charAt(0);
		add(scan);
	}

	// �� ���׽��� f = 3 x ^ 4 + 2 x + 6 ���·� ���
	@Override
	public void print() {
		System.out.print(name + " = ");
		for (Term t : terms) {
			t.print();
			System.out.print(" + ");
		}
		System.out.println(0);
	}

	// x�� ���� �޾� ���׽��� ����� ����� ��ȯ
	@Override
	public int calc(int x) {
		int result = 0;
		for (Term t : terms)
			result += t.calc(x);
		System.out.format("%c(%d) = %d\n", name, x, result);
		return result;
	}
	
	// ���� �ϳ� �Է¹޾� �� ���׽Ŀ� ������������ ���Ѵ�. ���� ����� ������ �Է���
	@Override
	public void add(Scanner scan) {
		int c = scan.nextInt();
		int e = scan.nextInt();
		addTerm(c, e);
	}
	@Override
	public boolean compare(String name2) {
		// TODO Auto-generated method stub
		return name == name2.charAt(0);
	}
	// ���� �߰��ϰų� ���� ã�� �Լ� private
	private void addTerm(int c, int e) {
		Term t = findTerm(e);
		if (t != null) {
			t.add(c);
			return;
		}
		t = new Term(c, e);
		int i = 0;
		for (i = 0; i < terms.size(); i++) {
			if (terms.get(i).compare(e) < 0) {
				break;
			}
		}
		terms.add(i, t);
	}
	private Term findTerm(int e) {
		for (Term t: terms)
			if (t.equals(e))
				return t;
		return null;
	}
}