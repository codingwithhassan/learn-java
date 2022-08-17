package task1;

public class Book implements BookInterface<Integer, Double> {

    private Integer bookId;
    private Integer pages;
    private Double price;

    public Book() {
        this.bookId = 0;
        this.pages = 0;
        this.price = 0.0;
    }

    public Book(int bookId, int pages, double price) {
        this.setBookId(bookId).setPages(pages).setPrice(price);
    }

    @Override
    public Book setBookId(Integer id) {
        this.bookId = id;
        return this;
    }

    @Override
    public Book setPages(Integer n) {
        this.pages = n;
        return this;
    }

    @Override
    public Book setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public Integer getBookId() {
        return bookId;
    }

    @Override
    public Integer getPages() {
        return pages;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public boolean isLarger(Book b) {
        return this.getPages() > b.getPages();
    }

    @Override
    public boolean isExpensive(Book b) {
        return this.getPrice() > b.getPrice();
    }

    @Override
    public void copy(Book b) {
        b.setBookId(this.getBookId());
        b.setPages(this.getPages());
        b.setPrice(this.getPrice());
    }

    @Override
    public String toString() {
        return String.format(
            "%d, %d, %.2f",
            this.getBookId(),
            this.getPages(),
            this.getPrice()
        );
    }

}
