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
{ //�θ�Ŭ������ �����ڷ� ���� �Ǿ� ���� �ʾƵ� �ڽ� Ŭ�������� ������ ��� ����
	private int grade;
	
	public Student(String name, String dept, int grade)
	{
		super(name,dept);
		this.grade=grade;
	}
	public void show()
	{
		super.show();
		System.out.println("( "+grade+"�г� )");
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
		Man s1 = new Student("ȫ�浿","��ǻ�Ͱ�������", 2); //����
		Man s2 = new Student("��ö��","�ΰ���������", 1);
		Man p1 = new Proffessor("����", "��ǻ�Ͱ�������", "������");
		//Student s1 = new Student("ȫ�浿","��ǻ�Ͱ�������", 2);
		//Student s2 = new Student("��ö��","�ΰ���������", 1);
		//Proffessor p1 = new Proffessor("����", "��ǻ�Ͱ�������", "������");
		Proffessor p2 = new Proffessor("�ͱ�", "�ΰ���������", "�α���");
		//Student m2 = new Man(); //�Ұ���
		Man []m = {s1, s2, p1, p2};
		for(Man list : m)
			list.show();
	}

}
