import java.util.Scanner;
public class Q7Part4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num0 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int num2 = in.nextInt();
        System.out.print("Enter 4th number: ");
        int num3 = in.nextInt();
        System.out.print("Enter 5th number: ");
        int num4 = in.nextInt();
        
        int min = num4;
        
        if(num0 <= num1 && num0 <= num2 && num0 <= num3 && num0 <= num4)
            min = num0;
        else if(num1 <= num0 && num1 <= num2 && num1 <= num3 && num1 <= num4)
            min = num1;
        else if(num2 <= num1 && num2 <= num0 && num2 <= num3 && num2 <= num4)
            min = num2;
        else if(num3 <= num1 && num3 <= num0 && num3 <= num2 && num3 <= num4)
            min = num3;

        System.out.print("Smallest Number is " + min);
        
    }
}