
public class gugudan {

	public static void main(String[] args) 
	{
		int i, j;
		
		for(i=2; i<10; i++)
		{
			if(i==3 || i==5) continue;
			for(j=1; j<10; j++)
			{
				if(i<j) break;
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print("\t");
			}
			System.out.println();
		}
		
		/*for(j=1; j<10; j++)
		{
			for(i=2; i<10; i++)
			{
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print("\t");
			}
			System.out.println();
		}*/
		/*for(i=2; i<10; i++)
		{
			for(j=1; j<10; j++)
			{
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print("\t");
			}
			System.out.println();
		}*/
	}

}
