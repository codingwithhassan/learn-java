package task1;

import java.util.ArrayList;
import java.util.List;

public class C1 {
	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("7 Habits of Highly Effective People", "Stephen Covey", "M. Hassan", 560);
		
		books.add(book1);
		
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
