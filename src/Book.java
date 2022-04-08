/*클래스 book 정의
 * 멤버변수 : 책제목, 저자구성
 * 메소드 : 문자열 (~의 저자는 ~) 반환함수 정의
 * 생성자 1. 책 제목과 저자 다 초기화 생성자를 정의 2.책제목만 초기화하는 생성자 정의 
 * 객체 : 1)제목과 저자 오버로딩하는 객체로 선언 2)제목만 오버로딩하는 객체로 선언 3)결과 출력
 */
class Books
{
	String title;
	String auther;
	
	public String print()
	{
		return title+"의 저자는 "+auther;
	}
	/*public void print()
	{
		System.out.println(title+"의 저자는 "+other);
	}*/
	public Books(String title, String auther)
	{
		this.title = title;
		this.auther = auther;
	}
	public Books() //디폴트생성자
	{
		//this.title="책제목없음";
		//this.auther="작가미상";
		this("책제목없음","작가미상");
	}
	public Books(String title)
	{
		//생성자에서 다른 생성자를 호출하는 명령 : this(), 반드시 첫줄
		this();
		this.title = title;
		//this.auther="작가미상"; //auther="작가미상"
	}
}
public class Book {

	public static void main(String[] args) 
	{
		Books b1 = new Books("지구끝의온실","김초엽"); //생성자 개수 상관 없음
		Books b2 = new Books("인어공주");
		Books b3 = new Books();
		System.out.println(b1.print());
		System.out.println(b2.print());
		System.out.println(b3.print());

	}

}
