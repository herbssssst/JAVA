package HomeWork;

import java.util.Scanner;

class Term2 {
	// 지수와 계수
	// 카멜 표기법과 풀네임으로 변수 선언
	public int Coefficient;
	public int Exponential;
}

class Polynomial2 {
	// 항들의 개수와 항들의 배열과 다항식의 이름.
	public int NumberOfTerms; // 항의 개수
	public Term2[] Terms = new Term2[100];
	public char PolynomialName; // 다항식의 이름

}

class PolynomialCalculater {
	// static으로 전역변수의 개념으로 작성했던 다항식들의 배열과 다항식들 개수를 클래스 필드로 변경.
	Polynomial2[] Polynomials = new Polynomial2[100];
	int n = 0;

	// 다항식을 출력해주는 함수.
	void printPolynomial(Polynomial2 p) {
		for (int i = 0; i < p.NumberOfTerms; i++) {
			printTerm(p.Terms[i]);
			System.out.print("+");
		}
		System.out.println();
	}

	// 항1개를 출력해주는 함수.
	void printTerm(Term2 t) {
		System.out.print(t.Coefficient + "x*" + t.Exponential);
	}

	// 다항식을 계산해주는 함수.
	int calcPolynomial(Polynomial2 p, int x) {
		int result = 0;
		for (int i = 0; i < p.NumberOfTerms; i++) {
			result += calcTerm(p.Terms[i], x);
		}
		return result;
	}

	int calcTerm(Term2 term, int x) {
		return (int) (term.Coefficient * Math.pow(x, term.Exponential));
	}

	// 하나의 다항식 객체와, 더할 지수, 계수를 매개변수로 받는다. - 덧셈을 수행. -
	void addTerm(Polynomial2 p, int coefficient, int exponential) {
		int index = findTerm(p, exponential);
		if (index != -1) {
			p.Terms[index].Coefficient += coefficient;
		} else {
			int i = p.NumberOfTerms - 1;
			while (i >= 0 && p.Terms[i].Exponential < exponential) {
				p.Terms[i + 1] = p.Terms[i];
			}
			p.Terms[i + 1] = new Term2();
			p.Terms[i + 1].Coefficient = coefficient;
			p.Terms[i + 1].Exponential = exponential;
			p.NumberOfTerms++;
		}
	}

	// 더할 때, 같은 승의 지수가 있는지를 확인 해주고, 있다면 해당 인덱스를 반환.
	int findTerm(Polynomial2 p, int e) {
		
		for (int i = 0; i < p.NumberOfTerms; i++) {
			if (p.Terms[i].Exponential == e) {
				return i;
			}
		}
		return -1;
	}

	// 같은 이름의 Polynomial을 찾아서 해당 인덱스를 반환.
	int find(char name) {
		for (int i = 0; i < n; i++) {
			if (Polynomials[i].PolynomialName == name) {
				return i;
			}
		}
		return -1;
	}

	// 실질적인 main()함수
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("$ ");
			String Command = sc.next();
			// 새로운 다항식 만들기
			if (Command.equals("create")) {
				char PolynomialName = sc.next().charAt(0);
				Polynomial2 p = new Polynomial2();
				p.PolynomialName = PolynomialName;
				Polynomials[n] = p;
				n++;
			}
			// 다항식의 덧셈
			else if (Command.equals("add")) {
				char PolynomialName = sc.next().charAt(0);
				int index = find(PolynomialName);
				if (index == -1) {
					System.out.println("No such polynomial exists");
				} else {
					int Cofficient = sc.nextInt();
					int Exponential = sc.nextInt();
					addTerm(Polynomials[index], Cofficient, Exponential);
				}
			}
			// 특정한 수를 넣어 다항식을 계산.
			else if (Command.equals("calc")) {
				char name = sc.next().charAt(0);
				int index = find(name);
				if (index == -1) {
					System.out.println("No such polynomial exists.");
				} else {
					int CalculateNumber = sc.nextInt();
					int result = calcPolynomial(Polynomials[index], CalculateNumber);
					System.out.println(result);
				}
			}
			// 다항식 출력.
			else if (Command.equals("print")) {
				char name = sc.next().charAt(0);
				int index = find(name);
				if (index == -1) {
					System.out.println("No such polynomial extists");
				} else {
					printPolynomial(Polynomials[index]);
				}
			} else if (Command.equals("exit")) {
				System.exit(0);
			} else {
				continue;
			}

		}

	}

}

public class afterhomework {
	public static void main(String[] args) {
		//main함수에서 PolynomialCalculater객체를 생성한 후 실질적인 메인함수의 역할을 하는 run()메서드를
		//호출함으로써 프로그램이 객체지향적인 순서를 밟을 수 있게 설계하였다.
		PolynomialCalculater polynomialcalculater = new PolynomialCalculater();
		polynomialcalculater.run();
	}

}
