interface Alram
{
	public default void beep()
	{
		System.out.println("삐삐삐 ~~~ ");
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
		System.out.println("전화거는 중 ~~~ ");
	}
	public void receiveCall() 
	{
		System.out.println("전화받는 중 !!! ");
	}
	public void picture() 
	{
		
	}
	public void game() 
	{
		System.out.println("게임 중 ~~~ ");
	}
	public void musicplay() 
	{
		System.out.println("행진곡으로 일어나기 ~~~ ");
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
