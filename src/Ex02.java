import java.util.Scanner;

/*Ŭ���� Rectangle ����
 * ���� : ���� ���� ����(�������)
 * �޼ҵ� : ���� ���ϱ� (��ȯ�Լ�)
 * 
 * ��ü ���� >> ���� ���� ���� �Է� �޾Ƽ� �����ϰ� ���
 */
class Rectangel
{
	int width;
	int heigh;
	
	public int getArea()
	{
		return width*heigh;
	}
}
public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		Rectangel r1 = new Rectangel();
		r1.width = in.nextInt();
		r1.heigh = in.nextInt();
		System.out.println("���̴� : "+r1.getArea());
		
		/*Rectangel rect = new Rectangel();
		rect.width=10;
		rect.heigh=5;
		System.out.println("�簢���� ���̴� :"+rect.getArea());*/
	}

}
