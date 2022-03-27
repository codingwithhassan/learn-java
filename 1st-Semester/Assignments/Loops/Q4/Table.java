package Q4;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int i = 0;
        while(i++ < 10)
            System.out.println(num+" X "+ i + " = " + i * num);
        
    }
}
