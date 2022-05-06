class Point
{
	private int x=10, y=10;
	
	/*public void set(int x, int y)
	{
		this.x=x;
		this.y=y;
	}*/
	public Point(int x, int y) //������
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
		super.x=x; // private ���������ڷ� ���� super.x = x�� �����߻�, ���� ����
		super.y=y; //protected ���������ڸ� ����ϸ� �ڽ�Ŭ������ ������� ��� ���
		this.color=color;
	}*/
public ColorPoint(int x, int y, String color)
{ //�θ�Ŭ������ �����ڷ� ���� �Ǿ� ������ �ڽ�Ŭ������ �����ڷ� ���ǵǾ����
	super(x,y);
	this.color = color;
}
	public void showColorprint()
	{
		System.out.print(color);
		showPoint(); //super ��������
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
