class Television
{
	private int channel;
	private int volumn;
	private boolean turnoff;
	
	public Television()
	{
		this.channel=7;
		this.volumn=15;
		this.turnoff=false;
	}
	public Television(int channel, int volumn, boolean turnoff)
	{
		this.channel=channel;
		this.volumn=volumn;
		this.turnoff=turnoff;
	}
	public String toString()
	{
		return "채널 "+channel+"의 소리 높이는 "+volumn+"이고 상태는 "+turnoff;
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	public boolean isTurnoff() {
		return turnoff;
	}
	public void setTurnoff(boolean turnoff) {
		this.turnoff = turnoff;
	}
	
}
public class Ex3 {

	public static void main(String[] args) 
	{
		Television tv1 = new Television(39, 20, true);
		System.out.println(tv1);
		
		tv1.setChannel(10);
		tv1.setVolumn(25);
		tv1.setTurnoff(true);
		System.out.println(tv1);
	}

}
