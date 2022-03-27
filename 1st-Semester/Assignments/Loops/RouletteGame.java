import java.security.SecureRandom;
import java.util.Scanner;

public class RouletteGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guessNumber;
        double dollars = 100;
        char choice;
        boolean isContinue = true;

        SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Current Balance: " + dollars + "\n");

        while (isContinue) {
            System.out.print(
                    "If You Want to Bet\nPress O for Odd\nPress E for Even\nPress Z for Zero\nPress Q for Quit\n:");
            choice = in.next().charAt(0);

            guessNumber = randomNumbers.nextInt(37);

            if (choice == 'o' || choice == 'O') {
                if (guessNumber % 3 == 0) {
                    System.out.println("Congratulation! You won " + 5 + " dollars.");
                    dollars += 5;
                } else {
                    System.out.println("Oops! You loose " + 5 + " dollars.");
                    dollars -= 5;
                }
                System.out.println("\nBalance: " + dollars + "\n");
            } else if (choice == 'e' || choice == 'E') {
                if (guessNumber % 2 == 0) {
                    System.out.println("Congratulation! You won " + 5 + " dollars.");
                    dollars += 5;
                } else {
                    System.out.println("Oops! You loose " + 5 + " dollars.");
                    dollars -= 5;
                }
                System.out.println("\nBalance: " + dollars + "\n");
            } else if (choice == 'z' || choice == 'Z') {
                if (guessNumber == 0) {
                    System.out.println("Congratulation! You won " + 50 + " dollars.");
                    dollars += 50;
                } else {
                    System.out.println("Oops! You loose " + 5 + " dollars.");
                    dollars -= 5;
                }
                System.out.println("\nBalance: " + dollars + "\n");
            } else if (choice == 'q' || choice == 'Q') {
                System.out.println("\nGood Bye!");
                isContinue = false;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
    }
}
