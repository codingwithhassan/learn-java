import java.util.Scanner;

public class LetterGradeLab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double value = 0;

        System.out.print("Please enter a single character: ");
        String input = in.nextLine();
        char letter = input.charAt(0);

        if (letter == 'A' || letter == 'a') {
            value = 4;
            if (input.length() > 1) {
                if (input.charAt(1) == '-')
                    value -= 0.3;
            }
        } else if (letter == 'B' || letter == 'b') {
            value = 3;
            if (input.length() > 1) {
                if (input.charAt(1) == '+')
                    value += 0.3;
                else if (input.charAt(1) == '-')
                    value -= 0.3;
            }
        } else if (letter == 'C' || letter == 'c') {
            value = 2;
            if (input.length() > 1) {
                if (input.charAt(1) == '+')
                    value += 0.3;
                else if (input.charAt(1) == '-')
                    value -= 0.3;
            }
        } else if (letter == 'D' || letter == 'd') {
            value = 1;
            if (input.length() > 1) {
                if (input.charAt(1) == '+')
                    value += 0.3;
                else if (input.charAt(1) == '-')
                    value -= 0.3;
            }
        } else if (letter == 'F' || letter == 'f') {
            value = 0;
        } else {
            System.out.println("Invalid grade!");
            System.exit(0);
        }

        System.out.println("The numeric value is " + value);
    }
}
