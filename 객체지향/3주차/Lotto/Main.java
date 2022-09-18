package Lotto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Lotto> lottoList = new ArrayList<Lotto>();
	Lotto buyer = null;
	Lotto winner = null;
	
	void run()
	{
		readAll();
		inputLotto();
		printAll();
	}
	
	void readAll()
	{
		String name=null;
		
		while(true)
		{
			name = scan.next();
			if(name.equals("0"))
				break;
			buyer = new Lotto();
			buyer.read(scan);
			
			lottoList.add(buyer);
		}
	}
	
	void printAll()
	{
		for(Lotto l : lottoList)
		{
			l.print();
		}
	}
	
	void inputLotto()
	{
		winner = new Lotto();
		System.out.print("ÃßÃ·¹øÈ£ [");
		winner.inputLotto();
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Main my  = new Main();
		my.run();
	}
}
