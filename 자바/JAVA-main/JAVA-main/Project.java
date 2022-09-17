import java.util.ArrayList;
import java.util.Scanner;

abstract class Friend
{
	protected String name, tel, address;
	public Friend(String name, String tel, String address)
	{
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	public abstract void ShowAllDate();
	public abstract void ShowBasicInfo();
}
class HighFriend extends Friend
{
	private String job;
	public HighFriend(String name, String tel, String address, String job)
	{
		super(name, tel, address);
		this.job = job;
	}
	public void ShowAllDate() //��ü ���� ���
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+tel);
		System.out.println("�ּ� : "+address);
		System.out.println("���� : "+job+"\n");
	}
	public void ShowBasicInfo() //�⺻ ���� ���
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+tel+"\n");
	}
}
class UnivFriend extends Friend
{
	private String dept;
	public UnivFriend(String name, String tel, String address, String dept)
	{
		super(name, tel, address);
		this.dept = dept;
	}
	public void ShowAllDate() //��ü ���� ���
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+tel);
		System.out.println("�ּ� : "+address);
		System.out.println("�а� : "+dept+"\n");
	}
	public void ShowBasicInfo() //�⺻ ���� ���
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+tel);
		System.out.println("�а� : "+dept+"\n");
	}
}
public class Project {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Friend> F = new ArrayList<Friend>();
		int choice=0; //�޴� ���� ����
		
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. �� ���� ����");
		System.out.println("2. ���� ģ�� ����");
		System.out.println("3. ��ü ���� ���");
		System.out.println("4. �⺻ ���� ���");
		System.out.println("5. ���α׷� ����");
		
		do
		{
			System.out.print("���� >>");
			choice = in.nextInt();
			String name, tel, address, job, dept;
			if(choice == 1) //��ģ�� ���� ����
			{	
				System.out.print("�̸� : ");
				name = in.next();
				
				System.out.print("��ȭ : ");
				tel = in.next();
				
				System.out.print("�ּ� : ");
				address = in.next();
				
				System.out.print("���� : ");
				job = in.next();
				
				System.out.println("�Է� �Ϸ�!");
				F.add(new HighFriend(name, tel, address, job));
			}
			else if(choice == 2) //���� ģ�� ����
			{
				System.out.print("�̸� : ");
				name = in.next();
				
				System.out.print("��ȭ : ");
				tel = in.next();
				
				System.out.print("�ּ� : ");
				address = in.next();
				
				System.out.print("�а� : ");
				dept = in.next();
				
				System.out.println("�Է� �Ϸ�!");
				F.add(new UnivFriend(name, tel, address, dept));
			}
			else if(choice == 3) //��ü ���� ���
			{
				for(Friend list : F)
					list.ShowAllDate();
			}
			else if(choice == 4) //�⺻ ���� ���
			{
				for(Friend list : F)
					list.ShowBasicInfo();
			}
		}
		while(choice != 5);
		
		System.out.print("���α׷��� �����մϴ�.");
	}

}
