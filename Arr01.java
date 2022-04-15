
class Circle
{
	int r; //멤버변수
	
	public Circle(int r) //메소드
	{
		this.r = r;
	}
	public double getArea() //원의 면적 반환 메소드
	{
		return r*r*3.14;
	}
}
public class Arr01 {

	public static void main(String[] args) 
	{
		Circle[] c = new Circle[5];
		for(int i=0; i<c.length; i++)
		{
			c[i] = new Circle(i+1); //반지름 1부터 5까지 생성
		}
		for(Circle obj:c)
			System.out.println(obj.getArea());
	}

}

/*import java.util.ArrayList;
 * ArrayList<String> s = new ArrayList<String>();
		
		s.add("사과");
		s.add("포도");
		s.add("딸기");
		
		for(String list:s)
			System.out.println(list);*/

