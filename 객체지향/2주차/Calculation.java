
import java.util.Scanner;

public class Calculation 
{	
	void mymain() 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �� ���� �Է��Ͻÿ� >> ");
		
		int num1 = scanner.nextInt(); // ù��° ���� ���� ����
		int num2 = scanner.nextInt(); // �ι�° ���� ���� ����
		
		System.out.print("������(+, -, *, /)�� �Է��Ͻÿ� >> ");
		String operator = scanner.next(); // ������ ���� ����
		
		String outline = "������ >> "+num1 + operator + num2+" = ";
		int result=0;
		
		switch(operator)
		{
			case "+":
				result = num1+num2;
				break;
			case "-":
				result = num1-num2;
				break;
			case "*":
				result = num1*num2;
				break;
			case "/":
				result = num1/num2;
				break;
			default :
				System.out.println("�߸��� ������Դϴ�. "+"������(+, -, *, /) Ȯ�� �� �ٽ� �õ����ּ���.");
		}
		scanner.close();
		System.out.println(outline+result);
	}

	public static void main(String[] args) 
	{
		Calculation c = new Calculation();
		c.mymain();
	}
}