import java.util.Scanner;

public class for01 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("╢э ют╥б :");
		int dan = in.nextInt();
		int i=1;
		
		while(i<10)
		{
			System.out.println(dan+" * "+i+" = "+dan*i);
			i++;
		}
	}
}
