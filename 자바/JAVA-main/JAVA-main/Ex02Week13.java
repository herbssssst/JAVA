
public class Ex02Week13 {

	public static void main(String[] args) 
	{
		String a = new String (" c#"); //������Ž
		String b = new String(",c++"); 
		System.out.println(a.length()+":"+b.length()); //���� �Լ�
		
		a = a.concat(b); //���ڿ� ���� >> a�� b�� ����
		System.out.println(a);
		
		a = a.trim(); //�¿� ���� ����? ���� ����
		System.out.println(a);
		
		a = a.replace("c#","java" ); //a�� ������ b�� �ٲ� >> ���ڿ� ��ġ
		System.out.println(a);
		
		String[] s = a.split(","); //���ڿ� �и�
		for(int i=0; i<s.length; i++)
			System.out.println("s["+i+"]="+s[i]);
		
		a = a.substring(5); //�ε��� 5���� ������ ���� ��Ʈ�� ����
		System.out.println(a);
		
		char c = a.charAt(1);
		System.out.println(c);
	}
}
