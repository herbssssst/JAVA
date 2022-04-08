//이거 할 수 이써야 중간고사 ,,,, 흑흐고ㅡㄱ흐그그극
class Box
{
	int width, height, depth;
	
	public void volumn()
	{
		System.out.println("박스의 부피는 "+(width*height*depth)); //+ 때문에 계산하려면 우선순위 () 써야함
	}
	public Box()
	{
		this(1,1,1);
	}
	//넓이, 높이만 초기화하는 생성자
	//모든 멤버변수를 다 초기화 하는 생성자
	public Box(int width, int height)
	{
		this();
		this.width=width;
		this.height=height;
	}
	public Box(int width, int height, int depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
}
public class Ex05 {

	public static void main(String[] args) 
	{
		Box b1 = new Box(10,20);
		Box b2 = new Box(10,20,30);
		//System.out.println(b1.width+","+b1.height+","+b1.depth);
		b1.volumn();
		b2.volumn();
	}
}
