import java.util.Scanner;

class Book
{
	String title, author; //å ����, �۰�
	
	public Book(String title, String author)
	{
		this.title=title;
		this.author=author;
	}
	public String toString()
	{
		return title +"�� ���ڴ� = "+author;
	}
}

public class BookArray {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Book[] book = new Book[2]; //Book ��ü 2���� �迭 ����
		
		for(int i=0; i<book.length; i++)
		{
			System.out.print("å ���� �Է� :");
			String title = in.nextLine();
			System.out.print("å ���� �Է� :");
			String author = in.nextLine();
			//��ü ����
			book[i] = new Book(title, author);
		}
		for(Book list:book)
			System.out.println(list);
		/*for(int i=0; i<book.length; i++)
			System.out.println(book[i]);*/
			//System.out.println(book[i].title+" �� ���ڴ� "+book[i].author);
	}

}
