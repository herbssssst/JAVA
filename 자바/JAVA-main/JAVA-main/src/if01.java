import java.util.Scanner;

public class if01 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� �ϳ� �Է�");
		int su = input.nextInt();
		
		if(su>=90)
			System.out.println("A�Դϴ�");
		else if(su>=80)
			System.out.println("B�Դϴ�");
		else if(su>=70)
			System.out.println("C�Դϴ�");
		else
			System.out.println("D�Դϴ�");
		
		/*if(su%2==0)
			System.out.println("¦���Դϴ�");
		else
			System.out.println("Ȧ���Դϴ�");*/
		
		/*if(su>0)
			System.out.println("���");
		else if(su==0)
			System.out.println("0�Դϴ�");
		else 
			System.out.println("����");*/
	}

}
