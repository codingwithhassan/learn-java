public class Book {
	private String name;
	private int id;
	private double price;
	private int noOfPages;

	public Book() {
		this.name = "No Name";
		this.id = 0;
		this.price = 0.0;
		this.noOfPages = 0;
	}

	public Book(String name, int id, double price, int noOfPages) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.noOfPages = noOfPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", price=" + price + ", noOfPages=" + noOfPages + "]";
	}
}
