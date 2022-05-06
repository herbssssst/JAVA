class Man
{
	private String name;
	private String dept;
	
	public Man(String name, String dept)
	{
		this.name = name;
		this.dept = dept;
	}
	public void show()
	{
		System.out.print(name+" : "+dept);
	}
}
class Student extends Man
{ //부모클래스가 생성자로 정의 되어 있지 않아도 자식 클래스에서 생성자 사용 가능
	private int grade;
	
	public Student(String name, String dept, int grade)
	{
		super(name,dept);
		this.grade=grade;
	}
	public void show()
	{
		super.show();
		System.out.println("( "+grade+"학년 )");
	}
}
class Proffessor extends Man
{
	String position;
	
	public Proffessor(String name, String dept, String position)
	{
		super(name,dept);
		this.position=position;
	}
	public void show()
	{
		super.show();
		System.out.println("( "+position+" )");
	}
}
public class Ex05 {

	public static void main(String[] args) 
	{
		Man s1 = new Student("홍길동","컴퓨터공학전공", 2); //가능
		Man s2 = new Student("김철수","인공지능전공", 1);
		Man p1 = new Proffessor("유리", "컴퓨터공학전공", "조교수");
		//Student s1 = new Student("홍길동","컴퓨터공학전공", 2);
		//Student s2 = new Student("김철수","인공지능전공", 1);
		//Proffessor p1 = new Proffessor("유리", "컴퓨터공학전공", "조교수");
		Proffessor p2 = new Proffessor("맹구", "인공지능전공", "부교수");
		//Student m2 = new Man(); //불가능
		Man []m = {s1, s2, p1, p2};
		for(Man list : m)
			list.show();
	}

}
