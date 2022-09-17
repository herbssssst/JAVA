import java.util.Scanner;

/*클래스 Rectangle 정의
 * 상태 : 가로 세로 길이(멤버변수)
 * 메소드 : 면적 구하기 (반환함수)
 * 
 * 객체 생성 >> 가로 세로 길이 입력 받아서 저장하고 출력
 */
class Rectangel
{
	int width;
	int heigh;
	
	public int getArea()
	{
		return width*heigh;
	}
}
public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		Rectangel r1 = new Rectangel();
		r1.width = in.nextInt();
		r1.heigh = in.nextInt();
		System.out.println("넓이는 : "+r1.getArea());
		
		/*Rectangel rect = new Rectangel();
		rect.width=10;
		rect.heigh=5;
		System.out.println("사각형의 넓이는 :"+rect.getArea());*/
	}

}
