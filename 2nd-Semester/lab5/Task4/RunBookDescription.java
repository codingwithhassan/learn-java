public class RunBookDescription {
    public static void main(String[] args) {
        BookDescription book = new BookDescription();

        book.setTitle("OOP");
        book.setAuthor("Deitel & Deitel");
        book.setPublisher("M. Hassan");
        book.setSoldCopies(354);

        System.out.printf(
            "Book Description:\nTitle: %s\nAuthor: %s\nPublisher: %s\nSold Copies: %d",
            book.getTitle(),
            book.getAuthor(),
            book.getPublisher(),
            book.getSoldCopies()
        );

    }
}
