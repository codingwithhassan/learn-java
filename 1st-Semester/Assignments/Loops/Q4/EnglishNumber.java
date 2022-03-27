package Q4;

import java.util.Scanner;

public class EnglishNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, tmp, digit, reverse = 0;

        System.out.print("Enter a number: ");
        num = in.nextInt();
        tmp = num;
        while (tmp != 0) {
            digit = tmp % 10;
            tmp = tmp / 10;

            reverse *= 10;
            reverse += digit;
        }

        while (reverse != 0) {

            digit = reverse % 10;

            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

            reverse = reverse / 10;
        }
    }
}
