
public class arr01 {

	public static void main(String[] args) 
	{
		int [] num = new int[5];
		for(int i=0; i<num.length; i++)
		{
			num[i] = i+1;
			System.out.print("num["+i+"]="+num[i]);
		}
		System.out.println();
		
		int [] num1 = {10,20,30,40,50,60,70,80,90};
		for(int i=0; i<num.length; i++)
			System.out.print("num["+i+"]="+num[i]);

	}

}
