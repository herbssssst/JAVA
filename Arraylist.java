import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	String name;
	int kor, eng, mat;
	double avg;
	char grade;
	//필요한 값만 초기화해도 괜찮음
	public Student(String name, double avg, char grade)
	{
		this.name = name;
		this.avg = avg;
		this.grade = grade;
	}
	@Override //똑같은 메소드를 내가 사용하겠다는 의미
	public String toString()
	{
		return name+"/"+avg+"/"+grade+"학점";
	}
}
public class Arraylist 
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		
		//Student [] s = new Student[3];
		for(int i=0; i<3; i++)
		{
			System.out.println("=== "+(i+1)+" 학생 정보 ===");
			System.out.print("이름 : ");
			String name=in.next();
			System.out.print("국어 점수 : ");
			int kor = in.nextInt();
			System.out.print("영어 점수 : ");
			int eng = in.nextInt();
			System.out.print("수학 점수 : ");
			int mat = in.nextInt();
			
			double avg = (double)(kor+eng+mat)/3;
			
			char grade;
			if(avg>=90)
				grade = 'A';
			else if(avg>=80)
				grade = 'B';
			else if(avg>=70)
				grade = 'C';
			else if(avg>=60)
				grade = 'D';
			else
				grade = 'F';
			
			list.add(new Student(name, avg, grade));
			//s[i] = new Student(name, avg, grade);
		}
		System.out.println("=== 결과 ===");
		for(Student s : list)
			System.out.println(s);
	}

}
