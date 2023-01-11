import java.util.Comparator;

public class SortByNoOfPages implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getNoOfPages() - o2.getNoOfPages();
	}

}
