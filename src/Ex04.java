class Pizza
{
	String type;
	int size;
	String side;
	
	public Pizza()
	{
		this("�޺���̼�",12,"����"); //Ÿ�� �������
		//this.type = "�޺���̼�";
		//this.size = 12;
		//this.side="����";
	}
	public Pizza(String type, int size)
	{
		this();
		this.type=type;
		this.size=size;
	}
	public Pizza(String type, int size, String side)
	{
		this.type=type;
		this.size=size;
		this.side=side;
	}
	public String toString() //���� �ִ� toString�� ���� �������Ѵٴ� �ǹ�
	{
		return "���� �ֹ��� ���ڴ� "+type+", ũ���"+size+"��ġ ���̵�޴� "+side;
	}
}
public class Ex04 {

	public static void main(String[] args) 
	{
		Pizza p1=new Pizza();
		Pizza p2=new Pizza("�Ұ������",15);
		Pizza p3=new Pizza("������",12,"�Ľ�Ÿ");
		System.out.println(p1.toString());
		System.out.println(p2); //�޼ҵ� ���� ����
		System.out.println(p3);
	}

}
