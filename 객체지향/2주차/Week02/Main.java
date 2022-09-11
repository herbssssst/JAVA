package Week02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	Scanner scan = new Scanner(System.in);
	ArrayList<Item> itemlist = new ArrayList<Item>();
	
	void run()
	{
		readAll();
		printAll();
	}
	void readAll()
	{
		while(true)
		{
			Item item = new Item();
			if(item.read(scan) == 1)
			{
				break;
			}
			itemlist.add(item);		
		}
	}
	void printAll()
	{
		for(Item list : itemlist)
		{
			list.print();
		}
	}
	
	public static void main(String[] args) 
	{
		Main my = new Main();
		my.run();
	}
}
