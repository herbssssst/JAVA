package Lotto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto 
{
	private String phone;
	private int lotto[] = new int[6];
	private static int winLotto[] = new int[6]; 
	
	static Random rand = new Random();
	private int count=0;
	
	void read(Scanner scan) {
		phone = scan.next();
		
		for(int i=0; i<6; i++)
			lotto[i] = rand.nextInt(45)+1;
	}
	
	void print() {
		System.out.print(phone+" [");
		printLotto();
		matches();
		System.out.printf(" ==> (%d°³) %dµî\n", count, rank(count));
	}
	
	void inputLotto() {
		for(int i=0; i<6; i++)
		{
			lotto[i] = rand.nextInt(45)+1;
			winLotto[i] = lotto[i];
		}	
		printLotto();
	}
	
	void printLotto() {
		for(int i=0; i<6; i++)
			System.out.format("%2d ", lotto[i]);
		
		System.out.print("]");
	}
	
	void matches() {
		int number = 0;
		
		for(int i=0; i<6; i++)
		{
			number = winLotto[i];
			for(int j=0; j<6; j++)
			{
				if(lotto[j] == number)
					count++;
			}
		}
	}
	
	int rank(int c)
	{
		switch(c)
		{
		case 3:
			return 5;
		case 4:
			return 4;
		case 5:
			return 3;
		case 6:
			return 1;
		default:
			return 0;
		}
	}
}
