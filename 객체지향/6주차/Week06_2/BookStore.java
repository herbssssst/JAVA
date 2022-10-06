package Week06_2;

public class BookStore extends Manager implements Factory{
	void run() {
		readAll(this);
		printAll();
		search();
	}

	
	@Override
	public Manageable create(String kwd) {
		return new Book(kwd);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore store = new BookStore();
		store.run();
	}

}
