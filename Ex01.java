
class Friend
{
	String name;
	String number;
	String adress;
	
	public Friend() //디폴트생성자
	{
		this("홍길동","공개안함","공개없음");
	}
	public Friend(String name, String number) //이름 번호 초기화
	{
		this();
		this.name = name;
		this.number = number;
	}
	public Friend(String name, String number, String adress) //이름 번호 주소 초기화
	{
		this.name = name;
		this.number = number;
		this.adress = adress;
	}
	public String toString() //toString으로 문자열 반환 메소드
	{
		return "이름 : "+name+" 전화번호 : "+number+" 주소 : "+adress;
	}
}
public class Ex01 {

	public static void main(String[] args) 
	{
		Friend f = new Friend("이채영","나만 알거야","언니는 긱사생");
		//Friend f1 = new Friend();
		//Friend f2 = new Friend("정진서","01040569122");
		//Friend f3 = new Friend("김가을","01041856827","행정동로");
		
		System.out.println(f);
		//System.out.println(f1.toString());
		//System.out.println(f2); //toString은 메소드 생락 가능
		//System.out.println(f3);
		}

}
