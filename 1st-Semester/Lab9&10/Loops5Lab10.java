import java.util.Scanner;
public class Loops5Lab10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        for(char choice = 'y';choice != 'n' && choice != 'N';){
            System.out.print("Enter first number: ");
            int num1 = in.nextInt();
            while(num1 < 0 || num1 % 2 != 0){
                System.out.print("Invalid Number! Number must be positive & even\nEnter first Number: ");
                num1 = in.nextInt();
            }
            System.out.print("Enter second number: ");
            int num2 = in.nextInt();
            while(num2 < 0 || num2 % 2 == 0){
                System.out.print("Invalid Number! Number must be positive & odd\nEnter second Number: ");
                num2 = in.nextInt();
            }
            
            System.out.println("Total : " + (num1+ num2));
            System.out.println("Square of "+num1+" : " + (num1 * num1));
            System.out.println("Square of "+num2+" : " + (num2 * num2));
            
            System.out.print("Do you repeat (y/n) ? :");
            choice = in.next().charAt(0);
        }
    }
}