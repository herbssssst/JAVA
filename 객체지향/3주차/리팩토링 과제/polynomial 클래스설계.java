package HomeWork;
import java.util.ArrayList;
import java.util.Scanner;

/*
	=== 사용법 ===
	create f 3 4 	: f = 3 x ^ 4 다항식 생성
	add f 2 1		: f에 2 x 항을 생성, f = 3 x ^ 4 + 2 x
	calc f 3		: f(3)을 계산해서 결과 출력
	add f 6 0		: f = 3 x ^ 4 + 2 x + 6
	print f		: f = 3 x ^ 4 + 2 x + 6 출력
	exit		: 종료
*/
class Calculater {
	ArrayList<Polynomial> polynomials = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	// 이름 한글자 읽어서 다항식 찾아 리턴, 없으면 null
	Polynomial find(Scanner sc) {

	public void run() {
		Polynomial p = null;
		while (true) {
			System.out.println("$ ");
			String command = sc.next();	
			// 항의 생성
			if (command.equals("create")) {
				p = new Polynomial();
				p.read(sc);
				polynomials.add(p);
				continue;
			} 
			if (command.equals("exit"))	// 종료
				break;
			p = find(sc);  // 그 이외의 경우는 이름을 입력받음
			if (p == null) // 이름의 다항식이 없으면 오류
				sc.nextLine();  //  이름 오류이므로 뒤 부분 읽어 버림
				break;
			switch (command) {
			case "add": // 다항식에 새로운 항 (c x ^ e)를 더함
				p.add(sc);
				break;
			case "calc": // 입력한 수로 f(x)를 계산
				int n = sc.nextInt();
				int result = p.calc(n);
				System.out.println(result);
				break;
			case "print": // 다항식 출력.
				p.print();
			default:
				break;
			}
		}
	}
}

public class Calulator {
	public static void main(String[] args) {
		Calculater calc = new Calculater();
		calc.run();
	}
}

class Polynomial {
	// 다항식의 항을 가지는 리스트
	ArrayList<Term> termArray = new ArrayList<>();
	char name; // 다항식의 이름

	// 입력에서 다항식의 이름과 계수, 지수를 받아 이름 저장 및 항을 하나 생성
	// 입력: f 3 4
	void read(Scanner scan) {

	// 이 다항식을 f = 3 x ^ 4 + 2 x + 6 형태로 출력
	void print() {

	// x의 값을 받아 다항식을 계산한 결과를 반환
	int calc(int x) {

	// 항을 하나 입력받아 이 다항식에 내림차순으로 더한다
	void add(Scanner scan) {

	// 항을 추가하거나 항을 찾는 함수 private
	private void addTerm(int c, int e) {
	private Term findTerm(int e) {
}

class Term {
	public int coeff;
	public int exponent;
	Term(c, e) {  // 생성자

	// 항을 c x ^ e 형태로 출력
	void print() {

	// x의 값을 받아 항을 계산한 결과를 반환
	int calc(int x) {

	// 지수를 비교하여 exponent가 e와 같으면 true,  아니면 false
	boolean equals(e) {

	 // 지수를 비교하여 exponent가 더 크면 1, 같으면 0, 작으면 -1 반환
	int compare(e) { 

	 // 지수가 같은 항의 계수를 받아 coeff에 더한다
	void add(int c) {
}