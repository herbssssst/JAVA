
public class Arr02 {
	public static void main(String[] args) 
	{
		String[] s1 = new String[3];
		s1[0]=new String("java");
		s1[1]=new String("�ڷᱸ��");
		s1[2]=new String("��ǻ�ͱ���");
		
		for(int i=0; i<s1.length; i++)
			System.out.print(s1[i]+" ");
		System.out.println();
		
		String[] s2= {"ü��","����","������","����","���"};
		for(int i=0; i<s2.length; i++)
			System.out.print("s2["+i+"]="+s2[i]);
		
	}

}
