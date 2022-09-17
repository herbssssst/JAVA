//생성자 연습
class Circle
{
	double radius;
	String name;
	
	public double getArea()
	{
		return radius*radius*3.14;
	}
	//초기화를 목적으로 생성자 정의
	//1. 클래스의 이름동일 2. 반환형태가 없는 특수 메소드
	public Circle()
	{
		name="원";
		radius=1.0;
	}
	public Circle(String n, double r) //생성자, void 를 주면 함수가 됨 절대 void 금지
	{
		name = n;
		radius = r;
	}
	//3. 똑같은 이름의 생성자는 여러개 줄 수 있다. (단, 매개변수의 개수가 다르거나 타입이 달라야 함)
	public Circle(String n)
	{
		name = n;
	}
	public Circle(double r)
	{
		radius = r;
	}
	public void print()
	{
		System.out.println(name+"의 면적은 "+getArea());
	}
}

public class Ex03 {

	public static void main(String[] args) 
	{
		 
		Circle c1 = new Circle("피자", 10.0);
		Circle c2 = new Circle("도넛"); //넓이는 0 >> 숫자는 초기화 시키지 않으면 0 나옴
		Circle c3 = new Circle(5.0); //이름 Null >> 초기화 시키지 않는 문자는 Null 나옴
		Circle c4 = new Circle(); //생성자가 하나라도 있으면 디폴트생성자 사용 못함, 맨위에 저거 있으면 가능
		c1.print();
		c2.print();
		c3.print();
	}

}
/*
public Student(String hak, String name, int ag)
{
	this.hakbun = hak; //this : 자기 자신을 가지키는 레퍼런스
	this.name = name; //변수 이름이 같으면 오류는 안 뜨지만 경고! 
	this.age=ag;
}
*/
