import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("���� ���� ���� �������������� �����Ͽ� �Է�");
		int kor = in.nextInt();
		int eng = in.nextInt();
		int mat = in.nextInt();
		int sum = kor+eng+mat;
		double avg = (double)sum/3;
		
		System.out.println("������:"+sum+" ��տ�:"+avg);
	}

}
