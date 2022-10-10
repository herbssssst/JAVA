package polynomial;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	ArrayList<Manageable> polynomials = new ArrayList<>();
	public Scanner scan = new Scanner(System.in);
	// �̸� �ѱ��� �о ���׽� ã�� ����, ������ null
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
			if (command.equals("exit"))	// ����
				break;
			// ���� ����
			if (command.equals("create")) {
				p = fac.create();
				p.read(scan);
				polynomials.add(p);
				continue;
			} 
			p = find(scan);  // �� �̿��� ���� �̸��� �Է¹���
			if (p == null) { // �̸��� ���׽��� ������ ����
				scan.nextLine();  //  �̸� �����̹Ƿ� �� �κ� �о� ����
				continue;
			}
			switch (command) {
			case "add": // ���׽Ŀ� ���ο� �� (c x ^ e)�� ����
				p.add(scan);
				break;
			case "calc": // �Է��� ���� f(x)�� ���
				int n = scan.nextInt();
				int result = p.calc(n);
				break;
			case "print": // ���׽� ���.
				p.print();
			default:
				scan.nextLine();
				break;
			}
		}
	}
}
