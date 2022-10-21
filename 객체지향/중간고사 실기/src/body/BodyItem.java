package body;

import java.util.Scanner;

import mgr.Manageable;
import mgr.Manager;

public class BodyItem implements Manageable{
	// �ٵ���� 08015508 C30      ���� ���¸����� 0 11200 15       5    �Ǽ�
	// type   id       location name ...           0 price quantity sale skinType
	String type;
	String id;
	String location;
	String name;
	
	int price;
	int quantity;
	int sale;
	String skinType;
	
	@Override
	public void read(Scanner sc) {
		String temp = null;
		type = sc.next();
		id = sc.next();
		location = sc.next();
		name = sc.next();
		while (true) {
			temp = sc.next();
			if (temp.equals("0"))
				break;
			name = name + " " + temp;
		}
		
		price = sc.nextInt();
		quantity = sc.nextInt();
		sale = sc.nextInt();
		skinType = sc.next();
	}
	
	@Override
	public void print() {
		System.out.format("%s [%s] %s - %s(%s)\n", 
				type, id, location, name, skinType);
		System.out.format("\t%d�� (��� %d��, �Ǹ� %d��)\n", 
				price, quantity, sale);
	}
	
	@Override
	public boolean matches(String kwd)
	{
		if(name.contains(kwd) || kwd.equals(type) || kwd.equals(price+"")
				|| kwd.equals(location))
			return true;
		
		return false;
	}
}