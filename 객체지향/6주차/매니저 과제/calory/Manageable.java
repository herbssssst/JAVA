package calory;

import java.util.Scanner;

public interface Manageable {
	public void read(Scanner scan);
	public String toString();
	public int getKcal(int s, String unit);
	public String getDetail(int n, String unit);
}
