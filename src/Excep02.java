
public class Excep02 {

	public static void main(String[] args) 
	{
		int [] num = {1, 2, 3, 4, 5};
		
		try 
		{
			for(int i=0; i<=num.length; i++)
				System.out.println("num["+i+"]="+num[i]);
		} 
		catch (Exception e) 
		{
			System.out.println("�迭�� ���� �������� �ʽ��ϴ�.");
		}
		finally
		{
			System.out.println("ũ�⸦ �����ϼ���");
		}
	}

}
