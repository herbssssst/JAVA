import java.util.Scanner;

class Book
{
	String title, author; //책 제목, 작가
	
	public Book(String title, String author)
	{
		this.title=title;
		this.author=author;
	}
	public String toString()
	{
		return title +"의 저자는 = "+author;
	}
}

public class BookArray {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Book[] book = new Book[2]; //Book 객체 2개인 배열 선언
		
		for(int i=0; i<book.length; i++)
		{
			System.out.print("책 제목 입력 :");
			String title = in.nextLine();
			System.out.print("책 저자 입력 :");
			String author = in.nextLine();
			//객체 생성
			book[i] = new Book(title, author);
		}
		for(Book list:book)
			System.out.println(list);
		/*for(int i=0; i<book.length; i++)
			System.out.println(book[i]);*/
			//System.out.println(book[i].title+" 의 저자는 "+book[i].author);
	}

}
