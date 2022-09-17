class Point
{
	private int x=10, y=10;
	
	/*public void set(int x, int y)
	{
		this.x=x;
		this.y=y;
	}*/
	public Point(int x, int y) //생성자
	{
		this.x = x;
		this.y = y;
	}
	public void showPoint()
	{
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point
{
	private String color="Red";
	
	/*public void setColor(int x, int y, String color)
	{
		super.x=x; // private 접근제한자로 인해 super.x = x가 오류발생, 원래 가능
		super.y=y; //protected 접근제한자를 사용하면 자식클래스에 멤버변수 사용 허용
		this.color=color;
	}*/
public ColorPoint(int x, int y, String color)
{ //부모클래스가 생성자로 정의 되어 있으면 자식클래스도 생성자로 정의되어야함
	super(x,y);
	this.color = color;
}
	public void showColorprint()
	{
		System.out.print(color);
		showPoint(); //super 생략가능
	}
}

public class ColorPointEx {

	public static void main(String[] args) 
	{
		Point p = new Point(5,5);
		//p.set(20, 20);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(50,50,"pink");
		//cp.setColor(70, 70, "white");
		cp.showColorprint();

	}

}
