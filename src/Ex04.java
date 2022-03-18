
public class Ex04 {

	public static void main(String[] args) 
	{
		int a=20, b=15;
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(a&b)+","+(a&b)); //100 4
		System.out.println(Integer.toBinaryString(a|b)+","+(a|b)); //11111 31
		System.out.println(Integer.toBinaryString(a^b)+","+(a^b));
		System.out.println(Integer.toBinaryString(~a)+","+(~a));
		
		System.out.println(Integer.toBinaryString(a<<2)+","+(a<<2));
	}		
}
