package task1;

public class Book {
	String title;
	String author;
	String publisher;
	int copiesSold;
	
	public Book(String title, String author, String publisher, int copiesSold) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copiesSold = copiesSold;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCopiesSold() {
		return copiesSold;
	}
	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}
	
	public void display() {
		System.out.print(this);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", copiesSold=" + copiesSold
				+ "]";
	}
}
