import java.util.Scanner;
public class Q7Part3{
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
        
        int max = num4;
        
        if(num0 >= num1 && num0 >= num2 && num0 >= num3 && num0 >= num4)
            max = num0;
        else if(num1 >= num0 && num1 >= num2 && num1 >= num3 && num1 >= num4)
            max = num1;
        else if(num2 >= num1 && num2 >= num0 && num2 >= num3 && num2 >= num4)
            max = num2;
        else if(num3 >= num1 && num3 >= num0 && num3 >= num2 && num3 >= num4)
            max = num3;

        System.out.print("Largest Number is " + max);
        
    }
}