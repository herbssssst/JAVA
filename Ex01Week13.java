
public class Ex01Week13 
{
	public static void main(String[] args)
	{
		String name1 = new String("oh");
		String name2 = new String("oh");
		//둘 다 객체이므로 다르게 나옴
		//둘 다 그냥 변수이므로 같다고 나옴
		//자바에서 객체를 비교할 때는 객체변수.equals(비교할 객체변수)
		if(name1.equals(name2))
			System.out.println("일치합니다.");
		else
			System.out.println("일치하지 않습니다.");
	}
}
