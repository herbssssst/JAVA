interface Printable //인터페이스는 클래스지만 특수하여 interface라는 예약어만 사용
{ 
	//아무것도 정의 되어있지 않은 프로토타입 메소드로만 구성되어 있음
	public void print();
}
interface Drawable
{
	public void draw();
}
//자바는 기본적으로 다중 상속을 허용 X, 단 인터페이스는 유일하게 다중상속 가능
class Shape1 implements Printable, Drawable
{
	//인터페이스를 상속 받은 클래스는 반드시 프로토타입 메소드를 구현해야함
	public void print()
	{
		System.out.println("도형을 프린터로 출력");
	}
	public void draw()
	{
		System.out.println("도형을 화면에 출력합니다");
	}
}
public class InterEx01 {
	public static void main(String[] args) 
	{
		//interface는 자기자신은 객체화 할 수 없음
		Shape1 s = new Shape1();
		s.print();
		s.draw();
	}

}
