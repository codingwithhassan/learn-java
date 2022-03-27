package Q4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, i = 1;
        long factorial = 1;

        System.out.print("Enter a number: ");        
        num = in.nextInt();

        while(i <= num){
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of number " + num + " is :" + factorial);
    }
}
