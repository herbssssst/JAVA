import java.util.Scanner;

class Pizza
{
	private String topping;
	static int count=0; //객체 생성 시 개수를 하나씩 증가
	
	public Pizza(String topping)
	{
		this.topping=topping;
		count++;
	}
	public static int getCount() //일반메소드는 클래스.메소드 불가능
	{                     //static 메소드만 클래스.메소드 가능
		return count;
	}
	public static void setCount(int count) {
		Pizza.count = count;
	}
	@Override
	public String toString() 
	{
		return "주문한 피자는 " + topping;
	}
	
	
	
}
public class Static01 {

	public static void main(String[] args) 
	{
		/*Pizza [] p = new Pizza[3];
		p[0] = new Pizza("불고기");
		p[1] = new Pizza("슈프림");
		p[2] = new Pizza("치즈");*/
		
		Pizza p1 = new Pizza("불고기");
		Pizza p2= new Pizza("슈프림");
		Pizza p3 = new Pizza("치즈");
		Pizza p[] = {p1, p2, p3};
		//int n=Pizza.count;
		
		for(Pizza list : p)
			System.out.println(list);
		
		System.out.println("팔린 피자의 개수는 : "+Pizza.getCount());
	}

}
