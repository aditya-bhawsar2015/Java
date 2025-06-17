package day5;

import java.util.ArrayList;
import java.util.List;

public class Library {
	public List<Book> initializeStock()
	{
		List<Book> books = new ArrayList<>();
		books.add(new Book(1234, "Java 8"));
		books.add(new Book(3456, "Java 11"));
		return books;
	}	
	public void addBook(Book b) throws DuplicateBookException
	{
		List<Book> stock = initializeStock();
		for(Book book : stock)
		{
			if(book.getIsbn()==b.getIsbn())
			{
				throw new DuplicateBookException("Book already exists");
			}
		}
		stock.add(b);
		System.out.println(stock);
	}
	
	public static void main(String[] args) {
		Library lib = new Library();
		lib.initializeStock();
		Book book = new Book(2234, "Python");
		try {
			lib.addBook(book);
		} catch (DuplicateBookException e) {
			e.printStackTrace();
		}
	}
}
