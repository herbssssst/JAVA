package Week03;

import java.util.ArrayList;
import java.util.Scanner;

class Calculater {
	ArrayList<Polynomial> polynomials = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	// �̸� �ѱ��� �о ���׽� ã�� ����, ������ null
	Polynomial find(Scanner sc) {
		char n = sc.next().charAt(0);
		for(int i=0; i<polynomials.size(); i++)
		{
			if(polynomials.get(i).name == n)
				return polynomials.get(i);
		}
		return null;
	}

	public void run() {
		Polynomial p = null;
		while (true) {
			System.out.print("$ ");
			String command = sc.next();	
			if (command.equals("exit"))	// ����
					break;
			// ���� ����
			if (command.equals("create")) {
				p = new Polynomial();
				p.read(sc);
				polynomials.add(p);
				continue;
			} 
			p = find(sc);  // �� �̿��� ���� �̸��� �Է¹���
			if (p == null){// �̸��� ���׽��� ������ ����
				sc.nextLine();  //  �̸� �����̹Ƿ� �� �κ� �о� ����
				continue;
			}
				
			switch(command)
			{
			case "add": // ���׽Ŀ� ���ο� �� (c x ^ e)�� ����
				p.add(sc);
				break;
			case "calc": // �Է��� ���� f(x)�� ���
				int n = sc.nextInt();
				p.calc(n);
				break;
			case "print": // ���׽� ���.
				p.print();
			default:
					sc.nextLine();
					break;
			}
		}
	}
	public static void main(String[] args) {
		Calculater calc = new Calculater();
		calc.run();
	}
}
