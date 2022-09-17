class Pizza
{
	String type;
	int size;
	String side;
	
	public Pizza()
	{
		this("콤비네이션",12,"없음"); //타입 맞춰야함
		//this.type = "콤비네이션";
		//this.size = 12;
		//this.side="없음";
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
	public String toString() //원래 있는 toString을 내가 재정의한다는 의미
	{
		return "내가 주문한 피자는 "+type+", 크기는"+size+"인치 사이드메뉴 "+side;
	}
}
public class Ex04 {

	public static void main(String[] args) 
	{
		Pizza p1=new Pizza();
		Pizza p2=new Pizza("불고기피자",15);
		Pizza p3=new Pizza("슈프림",12,"파스타");
		System.out.println(p1.toString());
		System.out.println(p2); //메소드 생략 가능
		System.out.println(p3);
	}

}
