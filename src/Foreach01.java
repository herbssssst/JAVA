
public class Foreach01 {

	public static void main(String[] args) 
	{
		int [] num = {10,20,30,40,50};
		int sum=0;
		for(int i : num)
			sum += i;
			//System.out.print(i+" ");
			System.out.print(sum+" ");
		System.out.print("\n");
		
		String [] s = {"ºÐÈ«", "º¸¶ó", "ÇÏ´Ã", "¿¬µÎ"};
		for(String n : s)
			System.out.print(n+" ");
		System.out.print("\n");

	}

}
