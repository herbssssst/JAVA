//�̰� �� �� �̽�� �߰���� ,,,, �����Ѥ���ױױ�
class Box
{
	int width, height, depth;
	
	public void volumn()
	{
		System.out.println("�ڽ��� ���Ǵ� "+(width*height*depth)); //+ ������ ����Ϸ��� �켱���� () �����
	}
	public Box()
	{
		this(1,1,1);
	}
	//����, ���̸� �ʱ�ȭ�ϴ� ������
	//��� ��������� �� �ʱ�ȭ �ϴ� ������
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
