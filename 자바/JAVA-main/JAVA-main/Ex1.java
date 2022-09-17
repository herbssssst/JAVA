class MathTest
{
	//메소드 오버로딩 : 클래스 안에 똑같은 이름의 함수가 여러개 만들어짐
	public int getSum(int x, int y)
	{
		return x+y;
	}
	public int getSum(int x, int y, int z) //규칙 1 : 매개변수의 개수가 다름
	{
		return x+y+z;
	}
	public double getSum(double x, double y) //규칙 2 : 타입형이 달라야 함
	{
		return x+y;
	}
}
public class Ex1 {

	public static void main(String[] args) 
	{
		MathTest test = new MathTest();
		System.out.println(test.getSum(10,20)); //30
		System.out.println(test.getSum(10,20,30)); //60
		System.out.println(test.getSum(10.0,20.0)); //30.0

	}

}
