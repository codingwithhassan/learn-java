package Q4;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        boolean isPrime = true;

        int sqrt = (int)Math.sqrt(num);

        int i = 2;
        while(i <= sqrt){
            if(num % i == 0){
                isPrime = false;
            }
            i++;
        }

        if(isPrime)
            System.out.println(num + " is Prime Number");
        else
            System.out.println(num + " is not Prime Number");
    }
}
