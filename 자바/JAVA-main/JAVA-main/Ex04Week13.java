import java.sql.Timestamp;
import java.util.Calendar;

public class Ex04Week13 {

	public static void main(String[] args) 
	{
		Timestamp time = new Timestamp(System.currentTimeMillis());
		System.out.println(time);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR)+"³â");
		System.out.println(c.get(Calendar.MONTH)+1+"¿ù");
		System.out.println(c.get(Calendar.DATE)+"ÀÏ");
	}

}
