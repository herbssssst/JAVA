
class Friend
{
	String name;
	String number;
	String adress;
	
	public Friend() //����Ʈ������
	{
		this("ȫ�浿","��������","��������");
	}
	public Friend(String name, String number) //�̸� ��ȣ �ʱ�ȭ
	{
		this();
		this.name = name;
		this.number = number;
	}
	public Friend(String name, String number, String adress) //�̸� ��ȣ �ּ� �ʱ�ȭ
	{
		this.name = name;
		this.number = number;
		this.adress = adress;
	}
	public String toString() //toString���� ���ڿ� ��ȯ �޼ҵ�
	{
		return "�̸� : "+name+" ��ȭ��ȣ : "+number+" �ּ� : "+adress;
	}
}
public class Ex01 {

	public static void main(String[] args) 
	{
		Friend f = new Friend("��ä��","���� �˰ž�","��ϴ� ����");
		//Friend f1 = new Friend();
		//Friend f2 = new Friend("������","01040569122");
		//Friend f3 = new Friend("�谡��","01041856827","��������");
		
		System.out.println(f);
		//System.out.println(f1.toString());
		//System.out.println(f2); //toString�� �޼ҵ� ���� ����
		//System.out.println(f3);
		}

}
