import java.util.Scanner;

public class Book {
    private int bookId;
    private int pages;
    private double price;

    void get(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the book ID: ");
        int id = input.nextInt();
        
        System.out.print("Enter the book pages: ");
        int pages = input.nextInt();
        
        System.out.print("Enter the book price: ");
        double price = input.nextDouble();

        set(id, pages, price);
    }

    void show(){
        System.out.printf(
            "BookID = %d\nPages = %d\nPrice = %.2f\n",  // %.2f also rounding the number
            bookId,
            pages,
            price
        );
    }

    void set(int b, int p, double pr){
        bookId = b;
        pages = p;
        price = pr;
    }
}
