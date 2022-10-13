package calory;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	public Scanner scan = new Scanner(System.in);
	ArrayList<Manageable> bookList = new ArrayList<>();
	
	public void readAll(String filename, Factory fac)
	{
		Scanner filein = openFile(filename);
		Manageable b = null;
		
		while(filein.hasNext())
		{
			b = fac.create(filein);
			b.read(filein);
			bookList.add(b);
		}
	}
	public void printAll()
	{
		for(Manageable b : bookList)
			b.print();
	}
	public void search() {
        String kwd = null;
        while (true) {
            System.out.print(">> ");
            kwd = scan.next();
            if (kwd.equals("end"))
                break;
            for (Manageable m : bookList) {
                if (m.matches(kwd))
                    m.print();
            }
        }
    }
	public Manageable find(String kwd)
	{
		for(Manageable b : bookList)
			if(b.matches(kwd))
				return b;
		return null;
	}
	
	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		}
		catch(Exception e) {
			System.out.printf("파일 오픈 실패 : %s\n",  filename);
			System.exit(0);
		}
		return filein;
	}
}
