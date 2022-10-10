package polynomial;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	ArrayList<Manageable> polynomials = new ArrayList<>();
	public Scanner scan = new Scanner(System.in);
	// 이름 한글자 읽어서 다항식 찾아 리턴, 없으면 null
	Manageable find(Scanner sc) {
		String name = sc.next();
		for (Manageable p: polynomials) {
			if (p.compare(name))
				return p;
		}
		return null;
	}
	
	public void calculator(Factory fac) {
		Manageable p = null;
		while (true) {
			System.out.print("$ ");
			String command = scan.next();	
			if (command.equals("exit"))	// 종료
				break;
			// 항의 생성
			if (command.equals("create")) {
				p = fac.create();
				p.read(scan);
				polynomials.add(p);
				continue;
			} 
			p = find(scan);  // 그 이외의 경우는 이름을 입력받음
			if (p == null) { // 이름의 다항식이 없으면 오류
				scan.nextLine();  //  이름 오류이므로 뒤 부분 읽어 버림
				continue;
			}
			switch (command) {
			case "add": // 다항식에 새로운 항 (c x ^ e)를 더함
				p.add(scan);
				break;
			case "calc": // 입력한 수로 f(x)를 계산
				int n = scan.nextInt();
				int result = p.calc(n);
				break;
			case "print": // 다항식 출력.
				p.print();
			default:
				scan.nextLine();
				break;
			}
		}
	}
}
