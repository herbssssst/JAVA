package calory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
	
public class Dine extends Manager implements Factory{
	void run() {
		readFoods(this);
		readEats();
	}
	
	@Override
	public Manageable create(String kwd) {
		return new Food(kwd);
	}
	
	public static void main(String[] args) {
		Dine a = new Dine();
		a.run();
	}	
}