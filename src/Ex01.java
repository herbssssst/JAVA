import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<>();
		/*num.add(10);
		num.add(20);
		num.add(30);
		
		//Integer�� ����ص� ������, ��ü�� �� �ִ� �ڷ����� �ᵵ �������
		for(int n:num) 
			System.out.print(n+" ");*/
		
		for(int i=0; i<=45; i++)
			num.add(i);
		
		/*for(int n:num)
			System.out.print(n+" ");
		System.out.println();*/
		Collections.shuffle(num);
		//int i=0;
		/*for(int n:num)
		{
			System.out.print(n+" ");
			//i++;
			//if(i==5) break;
		}*/
		System.out.println("\n�ζǹ�ȣ���");
		for(int i=0; i<5; i++)
			System.out.print(num.get(i)+" ");
	}

}
