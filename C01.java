class Students
{
	String name; //�̸�
	String num; //�й�
	int student; //�г�
	
	/*public void get()
	{
		System.out.println("�й� :"+num+" �̸� "+name+"�� �г���"+student+"�Դϴ�");
	}*/
}

public class C01 {

	public static void main(String[] args) 
	{
		Students a = new Students(); //��ü
		a.name="�谡��";
		a.num="202111448";
		a.student=2;
		//System.out.println(a.get());
		System.out.println("�й� :"+a.num+" �̸� "+a.name+"�� �г��� "+a.student+"�Դϴ�");
		
		Students b = new Students();
		b.name="�踮��";
		b.num="202111448";
		b.student=2;
		//System.out.println(a.get());
		System.out.println("�й� :"+b.num+" �̸� "+b.name+"�� �г��� "+b.student+"�Դϴ�");
		
	}

}
