
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
			System.out.println("배열의 방이 존재하지 않습니다.");
		}
		finally
		{
			System.out.println("크기를 조절하세요");
		}
	}

}
