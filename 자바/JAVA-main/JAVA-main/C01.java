class Students
{
	String name; //이름
	String num; //학번
	int student; //학년
	
	/*public void get()
	{
		System.out.println("학번 :"+num+" 이름 "+name+"의 학년은"+student+"입니다");
	}*/
}

public class C01 {

	public static void main(String[] args) 
	{
		Students a = new Students(); //객체
		a.name="김가을";
		a.num="202111448";
		a.student=2;
		//System.out.println(a.get());
		System.out.println("학번 :"+a.num+" 이름 "+a.name+"의 학년은 "+a.student+"입니다");
		
		Students b = new Students();
		b.name="김리아";
		b.num="202111448";
		b.student=2;
		//System.out.println(a.get());
		System.out.println("학번 :"+b.num+" 이름 "+b.name+"의 학년은 "+b.student+"입니다");
		
	}

}
