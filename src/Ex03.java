
public class Ex03 {

	public static void main(String[] args) 
	{
		int a=10, b=3;
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(!(a!=b)); //true
		System.out.println((a>=b)&&(a==5)); //�� �� �����ؾ� ��, 
		System.out.println((a>=b)||(a==5)); //�� �� �ϳ��� ����,
		
		String s1=new String("oh");
		String s2=new String("oh");
		System.out.println(s1.equals(s2));

	}

}
