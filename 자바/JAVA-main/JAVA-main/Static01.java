import java.util.Scanner;

class Pizza
{
	private String topping;
	static int count=0; //��ü ���� �� ������ �ϳ��� ����
	
	public Pizza(String topping)
	{
		this.topping=topping;
		count++;
	}
	public static int getCount() //�Ϲݸ޼ҵ�� Ŭ����.�޼ҵ� �Ұ���
	{                     //static �޼ҵ常 Ŭ����.�޼ҵ� ����
		return count;
	}
	public static void setCount(int count) {
		Pizza.count = count;
	}
	@Override
	public String toString() 
	{
		return "�ֹ��� ���ڴ� " + topping;
	}
	
	
	
}
public class Static01 {

	public static void main(String[] args) 
	{
		/*Pizza [] p = new Pizza[3];
		p[0] = new Pizza("�Ұ��");
		p[1] = new Pizza("������");
		p[2] = new Pizza("ġ��");*/
		
		Pizza p1 = new Pizza("�Ұ��");
		Pizza p2= new Pizza("������");
		Pizza p3 = new Pizza("ġ��");
		Pizza p[] = {p1, p2, p3};
		//int n=Pizza.count;
		
		for(Pizza list : p)
			System.out.println(list);
		
		System.out.println("�ȸ� ������ ������ : "+Pizza.getCount());
	}

}
