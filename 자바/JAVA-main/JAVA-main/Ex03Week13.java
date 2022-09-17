
public class Ex03Week13 
{
	public static void main(String[] args) 
	{
		System.out.println(Math.PI);
		System.out.println(Math.abs(-1234));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.exp(2));
		System.out.println(Math.round(3.6));
		System.out.println(Math.random());
		//System.out.println((int)(Math.random()));
		
		for(int i=0; i<5; i++)
			System.out.print((int)(Math.random()*45)+" ");
		//랜덤함수로 로또 번호 출력
	}
}
