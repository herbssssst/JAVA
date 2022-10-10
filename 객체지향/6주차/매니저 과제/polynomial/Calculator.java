package polynomial;

import java.util.ArrayList;
import java.util.Scanner;

/*
=== ���� ===
create f 3 4 	: f = 3 x ^ 4 ���׽� ����
add f 2 1		: f�� 2 x ���� ����, f = 3 x ^ 4 + 2 x
calc f 3		: f(3) = 249 �� ����ؼ� ��� ��� 
add f 6 0		: f = 3 x ^ 4 + 2 x + 6
print f		: f(x) = 3 x ^ 4 + 2 x + 6 + 0���
exit		: ����
*/
class Calculator extends Manager implements Factory{
	
	void run()
	{
		calculator(this);
	}
	@Override
	public Manageable create() {
		return new Polynomial();
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.run();
	}
}