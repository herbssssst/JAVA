import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	String name;
	int kor, eng, mat;
	double avg;
	char grade;
	//�ʿ��� ���� �ʱ�ȭ�ص� ������
	public Student(String name, double avg, char grade)
	{
		this.name = name;
		this.avg = avg;
		this.grade = grade;
	}
	@Override //�Ȱ��� �޼ҵ带 ���� ����ϰڴٴ� �ǹ�
	public String toString()
	{
		return name+"/"+avg+"/"+grade+"����";
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
			System.out.println("=== "+(i+1)+" �л� ���� ===");
			System.out.print("�̸� : ");
			String name=in.next();
			System.out.print("���� ���� : ");
			int kor = in.nextInt();
			System.out.print("���� ���� : ");
			int eng = in.nextInt();
			System.out.print("���� ���� : ");
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
		System.out.println("=== ��� ===");
		for(Student s : list)
			System.out.println(s);
	}

}
