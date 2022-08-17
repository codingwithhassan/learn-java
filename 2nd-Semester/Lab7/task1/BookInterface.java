package task1;

public interface BookInterface<T,T2> {
    Book setBookId(T id);
    Book setPages(T n);
    Book setPrice(T2 price);
    T getBookId();
    T getPages();
    T2 getPrice();
    void display();
    boolean isLarger(Book b);
    boolean isExpensive(Book b);
    void copy(Book b);
}
