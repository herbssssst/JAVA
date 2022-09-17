import java.util.Scanner;

public class switch02 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("수식 입력 ex)10+3 ");
		
		int su1 = input.nextInt();
		char op = input.next().charAt(0);
		int su2 = input.nextInt();	
		
		switch(op)
		{
			case '+':
				System.out.println(su1+"+"+su2+"="+(su1+su2));
				break;
			case '-':
				System.out.println(su1+"-"+su2+"="+(su1-su2));
				break;
			case '*':
				System.out.println(su1+"*"+su2+"="+(su1*su2));
				break;
			case '/':
				System.out.println(su1+"/"+su2+"="+(su1/su2));
				break;
	
		}
	}

}
