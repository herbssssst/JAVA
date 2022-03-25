
public class Arr02 {
	public static void main(String[] args) 
	{
		String[] s1 = new String[3];
		s1[0]=new String("java");
		s1[1]=new String("자료구조");
		s1[2]=new String("컴퓨터구조");
		
		for(int i=0; i<s1.length; i++)
			System.out.print(s1[i]+" ");
		System.out.println();
		
		String[] s2= {"체리","딸기","복숭아","포도","사과"};
		for(int i=0; i<s2.length; i++)
			System.out.print("s2["+i+"]="+s2[i]);
		
	}

}
