package Week02;

import java.util.Scanner;

public class Item 
{
	String itemCode;
	String name;
	int price;
	static int count = 1;
	
	int read(Scanner scan)
	{	
		itemCode = scan.next();
		if(itemCode.equals("0"))
		{
			return 1;
		}
		name = scan.next();
		price = scan.nextInt();
		
		return 0;
	}
	void print()
	{
		System.out.printf("%2d) [%s] %-12s\t %5d¿ø\n", count, itemCode, name, price);
		count++;
	}
}
