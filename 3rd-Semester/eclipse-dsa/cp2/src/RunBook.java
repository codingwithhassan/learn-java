import java.util.ArrayList;

public class RunBook {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(new Book());
		books.add(new Book("DSA", 2, 888, 777));
		books.add(new Book("Assembly", 1, 988, 776));
		books.add(new Book("B - Automata", 3, 989, 576));

		books.sort(new SortByName());
		books.sort(new SortByNoOfPages());
		books.sort(new SortByPrice());
		
		for(Book book: books) System.out.println(book);

	}

}
