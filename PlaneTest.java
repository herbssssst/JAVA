class Plane
{
	private String made; //������
	private String model; //��
	private int MaxPerson;
	static int planes;
	
	public Plane() //����Ʈ ������
	{
		this.model="A380";
		this.MaxPerson=500;
		this.made="airbus";
		planes++;
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
		return "������ : "+model+", �°��� : "+MaxPerson+", ������ : "+made;
	}
}
public class PlaneTest {

	public static void main(String[] args) 
	{
		Plane P1 = new Plane("Boeing 737", 800, "Asiana");
		Plane P2 = new Plane("Boeing 800", 900, "Korea");
		Plane P3 = new Plane();
		
		Plane p[] = {P1, P2, P3};
		System.out.println("����� ���� : "+Plane.planes);
		for(Plane list : p)
			System.out.println(list);
	}

}