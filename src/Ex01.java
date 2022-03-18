import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를공백으로 구별하여 입력");
		int kor = in.nextInt();
		int eng = in.nextInt();
		int mat = in.nextInt();
		int sum = kor+eng+mat;
		double avg = (double)sum/3;
		
		System.out.println("총점은:"+sum+" 평균운:"+avg);
	}

}
