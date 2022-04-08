//상태 (멤버변수) + 동작(메소드)
//생성자를 통해 객체생성 + 초기화

//과제 확인
class Student
{
	//private String hakbun; //private : 접근제한자 >> 아무도 못 가져감
	String hakbun;
	String name;           //public : 다주겠다, 접근 가능
	int age;
	
	/*public void print() //반환형태가 없을 때, void 꼭 써야함 //입력, 반환 X
	{
		System.out.println(hakbun+":"+name+" 의 나이는 "+age);
	}*/
	public String print() //반환 형태 써야함 //입력X 반환O
	{
		return hakbun+":"+name+" 의 나이는 "+age;
	}
	public void SetHakbun(String hak) //입력O 반환X
	{
		hakbun=hak;
	}
	public int getAge(int age) //입력O 반환O
	{
		return age+3;
	}
}


public class Ex01 {

	public static void main(String[] args) 
	{
		Student s1 = new Student(); //디폴트 생성자, 생성자가 정의되어 있지 않음
		s1.SetHakbun("202111448"); //객체.멤버변수=값
		s1.name="kim ga eul"; 
		s1.age=21; 
		//s1.print(); //객체.메소드
		System.out.println(s1.print());
		System.out.println(s1.name+" 의 졸업나이는 "+s1.getAge(21));
		
		Student s2 = new Student();
		s2.SetHakbun("201911448");
		s2.name = "삐약";
		s2.age=23;
		//s2.print();
		System.out.println(s2.print());
		System.out.println(s2.name+" 의 졸업나이는 "+s2.getAge(23));
	}

}
