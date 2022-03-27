package Q4;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int count = 0;

        System.out.print("Factors are: ");
        int i = 1;
        while(i < num){
            if(num % i == 0){
                count++;
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\nTotal Factors: " + count);
    }
}
