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
	public void ShowAllDate() //전체 정보 출력
	{
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+tel);
		System.out.println("주소 : "+address);
		System.out.println("직업 : "+job+"\n");
	}
	public void ShowBasicInfo() //기본 정보 출력
	{
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+tel+"\n");
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
	public void ShowAllDate() //전체 정보 출력
	{
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+tel);
		System.out.println("주소 : "+address);
		System.out.println("학과 : "+dept+"\n");
	}
	public void ShowBasicInfo() //기본 정보 출력
	{
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+tel);
		System.out.println("학과 : "+dept+"\n");
	}
}
public class Project {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Friend> F = new ArrayList<Friend>();
		int choice=0; //메뉴 선택 변수
		
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 고교 정보 저장");
		System.out.println("2. 대학 친구 저장");
		System.out.println("3. 전체 정보 출력");
		System.out.println("4. 기본 정보 출력");
		System.out.println("5. 프로그램 종료");
		
		do
		{
			System.out.print("선택 >>");
			choice = in.nextInt();
			String name, tel, address, job, dept;
			if(choice == 1) //고교친구 정보 저장
			{	
				System.out.print("이름 : ");
				name = in.next();
				
				System.out.print("전화 : ");
				tel = in.next();
				
				System.out.print("주소 : ");
				address = in.next();
				
				System.out.print("직업 : ");
				job = in.next();
				
				System.out.println("입력 완료!");
				F.add(new HighFriend(name, tel, address, job));
			}
			else if(choice == 2) //대학 친구 저장
			{
				System.out.print("이름 : ");
				name = in.next();
				
				System.out.print("전화 : ");
				tel = in.next();
				
				System.out.print("주소 : ");
				address = in.next();
				
				System.out.print("학과 : ");
				dept = in.next();
				
				System.out.println("입력 완료!");
				F.add(new UnivFriend(name, tel, address, dept));
			}
			else if(choice == 3) //전체 정보 출력
			{
				for(Friend list : F)
					list.ShowAllDate();
			}
			else if(choice == 4) //기본 정보 출력
			{
				for(Friend list : F)
					list.ShowBasicInfo();
			}
		}
		while(choice != 5);
		
		System.out.print("프로그램을 종료합니다.");
	}

}
