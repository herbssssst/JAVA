// 1. 상속 (재사용) : extends
// 2. super.멤버변수, super.메소드
// 3. 부모클래스 생성자로 초기화되어 있다면 상속받은 자식 클래스도 반드시 생성자로 초기화
// 4. 부모클래스를 자식 클래스 메소드 재정의 => 메소드 오버라이딩
// 5. 부모클래스로 자식클래스를 생성할 수 있다 (상속관계) // 중요 !! 오엑스 문제

class Item
{
	public int price;	
}
class Noodle extends Item //자식 클래스 메뉴 가격과 이름을 정의하는 
{
	public Noodle()
	{
		super.price = 4000;
	}
	public String toString()
	{
		return "국수";
	}
}
class MixNoodle extends Item
{
	public MixNoodle()
	{
		super.price = 4500;
	}
	public String toString()
	{
		return "비빔국수";
	}
}
class Woodong extends Item
{
	public Woodong()
	{
		super.price = 5000;
	}
	public String toString()
	{
		return "우동";
	}
}
class Buyer
{
	int money;
	public Buyer(int money)
	{
		this.money = money;
	}
	public void buy(Item it, int count) //메뉴 선택, 계산을 통해 남은 돈 계산
	{
		System.out.println(it+"를 "+count+"개 주문하였습니다");
		money = money - (it.price*count);
		System.out.println("주문 후 남은 돈은 "+money+"원 입니다");
	}
}
public class Ex01 {

	public static void main(String[] args) 
	{
		Item it1 = new Noodle();
		System.out.println(it1+"의 가격은 "+it1.price);
		
		Item it2 = new MixNoodle();
		System.out.println(it2+"의 가격은 "+it2.price);
		
		Item it3 = new Woodong();
		System.out.println(it3+"의 가격은 "+it3.price);
		
		System.out.println("====주문한 메뉴와 개수를 출력하고 남은 돈 출력====");
		Buyer buyer = new Buyer(20000);
		buyer.buy(new Noodle(), 2);
		buyer.buy(new MixNoodle(), 1);
	}

}
