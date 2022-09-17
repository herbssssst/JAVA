class Plane
{
	private String made; 
	private String model;
	private int MaxPerson;
	private static int planes;
	
	public Plane() 
	{
		//this.model="A380";
		//this.MaxPerson=500;
		//this.made="airbus";
		this("A380", 500, "airbus");
		//planes++;
	}
	public Plane(String model, int MaxPerson, String made)
	{
		this.model=model;
		this.MaxPerson=MaxPerson;
		this.made=made;
		planes++;
	}
	@Override
	public String toString()
	{
		return "비행기 모델 : "+model+", 승객수 : "+MaxPerson+", 제조사 : "+made;
	}
	//static 멤버변수를 반환 하거나 할당해주는 메소드도 static으로 정의
	public static int getPlanes()
	{
		return planes;
	}
}
public class PlaneTest {

	public static void main(String[] args) 
	{
		Plane P1= new Plane();
		Plane P3 = new Plane("Boeing 737", 800, "Asiana");
		Plane P2 = new Plane("Boeing 800", 900, "Korea");
		
		Plane p[] = {P1, P2, P3};
		System.out.println("비행기 개수 : "+Plane.getPlanes());
		for(Plane list : p)
			System.out.println(list);
	}

}