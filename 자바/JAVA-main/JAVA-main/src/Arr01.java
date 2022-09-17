import java.util.ArrayList;

public class Arr01 {

	public static void main(String[] args) 
	{
		ArrayList<String> name = new ArrayList<>();
		//name은 객체, for문으로 못 가져옴, for-each만 가능
		//String [] name = {" ~ "}에서의 name은 변수, for문으로 불러올 수 있음
		name.add("강서연");
		name.add("김지윤");
		name.add("이시현");
		name.add("정진서");
		name.add("조승훈");
		
		for(String s:name)
			System.out.print(s+" ");
		name.remove(1); //name.remove("김지윤") 이렇게도 가능
		System.out.print("\n");
		
		for(String s:name)
			System.out.print(s+" ");
		System.out.print("\n 찾는 사람 검색 : ");
		//String irum = name.get(2);
		System.out.println(name.get(2));
		
		name.add(1, "아이유");
		for(String s:name)
			System.out.print(s+" ");
		System.out.print("\n");
		
		name.add(1, "송중기");
		for(String s:name)
			System.out.print(s+" ");
		System.out.print("\n");
	}

}
