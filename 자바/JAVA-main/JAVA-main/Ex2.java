class Account
{   //���������� public : ��� Ŭ������ ���
	private int regNum;
	private String name;
	//���������� private : �ܺηκ��� ����� ����
	private int balance;
	
	//�ҽ� -> ���ʷ���Ʈ getter , setter -> �ڵ� ����
	public int getRegNum() {
		return regNum;
	}
	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	/*public void setBalance(int balance) //private�� �����Ϸ��� �Լ� �ϳ� ����
	{
		this.balance = balance;
	}
	public int getBalance()
	{
		return balance;
	}*/
}
public class Ex2 {

	public static void main(String[] args) 
	{
		Account obj = new Account();
		obj.setRegNum(1111);
		obj.setName("������");
		obj.setBalance(100);
		
		System.out.println(obj.getName()+"�� ���� : "+obj.getRegNum()+" �ܾ��� "+obj.getBalance());

	}

}
