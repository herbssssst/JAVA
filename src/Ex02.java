import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("�������� ������ �Է��Ͻÿ� : ");
		int orange = in.nextInt();
		
		int box = orange/10;
		int result = box % 10;
		
		System.out.println("�ڽ��� ������ :"+box+" ���� ������ ������:"+result);

	}

}
