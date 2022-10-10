package polynomial;

import java.util.Scanner;

interface Manageable {
	public void read(Scanner scan);
	public void print();
	public int calc(int x);
	public void add(Scanner scan);
	public boolean compare(String name2);
}
