class Account
{   //접근제한자 public : 모든 클래스에 허용
	private int regNum;
	private String name;
	//접근제한자 private : 외부로부터 사용을 차단
	private int balance;
	
	//소스 -> 제너레이트 getter , setter -> 자동 생성
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
	
	/*public void setBalance(int balance) //private에 접근하려면 함수 하나 생성
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
		obj.setName("오은성");
		obj.setBalance(100);
		
		System.out.println(obj.getName()+"의 계좌 : "+obj.getRegNum()+" 잔액은 "+obj.getBalance());

	}

}
