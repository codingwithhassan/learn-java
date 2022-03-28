import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice, digit;
        String num, inverse;

        System.out.print(
                "Press 1 to find one's complement of Binary Number\nPress 2 to find Two's complement of Binary Number\n:");
        choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Binary Number: ");
                num = in.next();

                inverse = "";
                for (int i = 0; i < num.length(); i++) {
                    digit = Integer.parseInt(num.charAt(i) + "");
                    inverse += digit == 1 ? 0 : 1;
                }

                System.out.println(inverse);

                break;
            case 2:
                System.out.print("Enter Binary Number: ");
                num = in.next();

                inverse = "";
                int i = 0;
                for (; i < num.length(); i++) {
                    digit = Integer.parseInt(num.charAt(i) + "");
                    inverse += digit == 1 ? 0 : 1;
                }

                int twoComplement = Integer.parseInt(inverse) + 1;

                String zeros = "";
                int j = (int) Math.log10(twoComplement) + 1;
                while (j < i) {
                    zeros += "0";
                    j++;
                }

                System.out.println(twoComplement + zeros);

                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

    }

}
