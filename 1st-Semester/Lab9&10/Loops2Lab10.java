import java.util.Scanner;
public class Loops2Lab10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        for(char choice = 'y';choice != 'n' && choice != 'N';){
            System.out.print("Enter first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter second number: ");
            int num2 = in.nextInt();
            long prod = num1 * num2;
            System.out.println("Product is : " + prod);
            
            System.out.print("Do you repeat (y/n) ? :");
            choice = in.next().charAt(0);
        }
    }
}