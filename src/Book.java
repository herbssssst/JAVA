/*Ŭ���� book ����
 * ������� : å����, ���ڱ���
 * �޼ҵ� : ���ڿ� (~�� ���ڴ� ~) ��ȯ�Լ� ����
 * ������ 1. å ����� ���� �� �ʱ�ȭ �����ڸ� ���� 2.å���� �ʱ�ȭ�ϴ� ������ ���� 
 * ��ü : 1)����� ���� �����ε��ϴ� ��ü�� ���� 2)���� �����ε��ϴ� ��ü�� ���� 3)��� ���
 */
class Books
{
	String title;
	String auther;
	
	public String print()
	{
		return title+"�� ���ڴ� "+auther;
	}
	/*public void print()
	{
		System.out.println(title+"�� ���ڴ� "+other);
	}*/
	public Books(String title, String auther)
	{
		this.title = title;
		this.auther = auther;
	}
	public Books() //����Ʈ������
	{
		//this.title="å�������";
		//this.auther="�۰��̻�";
		this("å�������","�۰��̻�");
	}
	public Books(String title)
	{
		//�����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� ��� : this(), �ݵ�� ù��
		this();
		this.title = title;
		//this.auther="�۰��̻�"; //auther="�۰��̻�"
	}
}
public class Book {

	public static void main(String[] args) 
	{
		Books b1 = new Books("�������ǿ½�","���ʿ�"); //������ ���� ��� ����
		Books b2 = new Books("�ξ����");
		Books b3 = new Books();
		System.out.println(b1.print());
		System.out.println(b2.print());
		System.out.println(b3.print());

	}

}
