//클래스 student정의
//상태 : 멤버변수 : 학번, 이름, 학년
//동작 : 출력 메소드(학번 : 이름 의 학년은 ~ 입니다.)
/*public void print()
 * {
 * System.out.println(hakvun+";");
 * }
 */
//객체 2개 생성하여 위 클래스를 통해 특징 출력
class Circle //원 설계도
{
	//상태(멤버변수): 이름의 반지름
	String name; //속성
	double r;
	
	//동작(메소드) : 원의 면적을 반환해주는 메소드
	double getArea() //돌려주는 함수 이름에 get, 받아올 때 set, 묵언의 약속
	{
		return r*r*3.14;
	}
}
public class C01 {

	public static void main(String[] args)
	{
		Circle p = new Circle(); //객체
		p.name="피자"; //객체.속성=" " >>값 부여
		p.r=10.0;
		
		double area=p.getArea();
		System.out.println(p.name+" 의 면적은 :"+area);
		
		Circle d= new Circle();
		d.name="도넛";
		d.r=2.0;
		System.out.println(d.name+" 의 면적은 :"+d.getArea());
		
	}
}

