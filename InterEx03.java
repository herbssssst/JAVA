interface Alram
{
	public default void beep()
	{
		System.out.println("�߻߻� ~~~ ");
	}
	public void musicplay();
}
interface Phone
{
	public void sendCall();
	public void receiveCall();
}
interface MobliePhone extends Phone
{
	public void picture();
	public void game();
}
class Pda
{
	public int add(int x, int y)
	{
		return x+y;
	}
}
class SmartPhone extends Pda implements Alram, MobliePhone
{
	public void sendCall() 
	{
		System.out.println("��ȭ�Ŵ� �� ~~~ ");
	}
	public void receiveCall() 
	{
		System.out.println("��ȭ�޴� �� !!! ");
	}
	public void picture() 
	{
		
	}
	public void game() 
	{
		System.out.println("���� �� ~~~ ");
	}
	public void musicplay() 
	{
		System.out.println("���������� �Ͼ�� ~~~ ");
	}
}
public class InterEx03 {

	public static void main(String[] args) 
	{
		SmartPhone smart = new SmartPhone();
		smart.beep();
		smart.sendCall();
		smart.game();
		smart.picture();
	}

}
