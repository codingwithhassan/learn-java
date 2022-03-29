package Q4;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;

        System.out.print("Factors are: ");
        int i = 1;
        while(i < num){
            if(num % i == 0){
                sum += i;
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();

        if(sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");

    }
}
