package Polynomial;

import java.util.ArrayList;
import java.util.Scanner;

class Calculater {
	ArrayList<Polynomial> polynomials = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	// 이름 한글자 읽어서 다항식 찾아 리턴, 없으면 null
	Polynomial find(Scanner sc) 
	{

	}
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
			switch (command) 
			{
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
