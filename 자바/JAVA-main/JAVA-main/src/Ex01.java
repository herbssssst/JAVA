//���� (�������) + ����(�޼ҵ�)
//�����ڸ� ���� ��ü���� + �ʱ�ȭ

//���� Ȯ��
class Student
{
	//private String hakbun; //private : ���������� >> �ƹ��� �� ������
	String hakbun;
	String name;           //public : ���ְڴ�, ���� ����
	int age;
	
	/*public void print() //��ȯ���°� ���� ��, void �� ����� //�Է�, ��ȯ X
	{
		System.out.println(hakbun+":"+name+" �� ���̴� "+age);
	}*/
	public String print() //��ȯ ���� ����� //�Է�X ��ȯO
	{
		return hakbun+":"+name+" �� ���̴� "+age;
	}
	public void SetHakbun(String hak) //�Է�O ��ȯX
	{
		hakbun=hak;
	}
	public int getAge(int age) //�Է�O ��ȯO
	{
		return age+3;
	}
}


public class Ex01 {

	public static void main(String[] args) 
	{
		Student s1 = new Student(); //����Ʈ ������, �����ڰ� ���ǵǾ� ���� ����
		s1.SetHakbun("202111448"); //��ü.�������=��
		s1.name="kim ga eul"; 
		s1.age=21; 
		//s1.print(); //��ü.�޼ҵ�
		System.out.println(s1.print());
		System.out.println(s1.name+" �� �������̴� "+s1.getAge(21));
		
		Student s2 = new Student();
		s2.SetHakbun("201911448");
		s2.name = "�߾�";
		s2.age=23;
		//s2.print();
		System.out.println(s2.print());
		System.out.println(s2.name+" �� �������̴� "+s2.getAge(23));
	}

}
