import java.util.ArrayList;

public class Arr01 {

	public static void main(String[] args) 
	{
		ArrayList<String> name = new ArrayList<>();
		//name�� ��ü, for������ �� ������, for-each�� ����
		//String [] name = {" ~ "}������ name�� ����, for������ �ҷ��� �� ����
		name.add("������");
		name.add("������");
		name.add("�̽���");
		name.add("������");
		name.add("������");
		
		for(String s:name)
			System.out.print(s+" ");
		name.remove(1); //name.remove("������") �̷��Ե� ����
		System.out.print("\n");
		
		for(String s:name)
			System.out.print(s+" ");
		System.out.print("\n ã�� ��� �˻� : ");
		//String irum = name.get(2);
		System.out.println(name.get(2));
		
		name.add(1, "������");
		for(String s:name)
			System.out.print(s+" ");
		System.out.print("\n");
		
		name.add(1, "���߱�");
		for(String s:name)
			System.out.print(s+" ");
		System.out.print("\n");
	}

}
