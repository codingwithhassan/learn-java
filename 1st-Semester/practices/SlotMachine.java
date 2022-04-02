import java.util.Scanner;
import java.security.SecureRandom;
public class SlotMachine{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        String fruit;

        System.out.print("Enter the amount of money: ");
        double amount = in.nextDouble();
        double won = 0;

        char choice = 'y';

        while(choice == 'y' || choice == 'Y'){
            int guessNumber0 = random.nextInt(5);
            int guessNumber1 = random.nextInt(5);
            int guessNumber2 = random.nextInt(5);

            System.out.println(getFruit(guessNumber0)+ " | " + getFruit(guessNumber1)+ " | " + getFruit(guessNumber2));

            if(guessNumber0 == guessNumber1 && guessNumber0 == guessNumber2){
                won += amount * 3;
                System.out.println("You won $"+(amount * 2)+".\n");
            }else if(
                guessNumber0 == guessNumber1 ||
                guessNumber0 == guessNumber2 ||
                guessNumber1 == guessNumber2
            ){
                won += amount * 2;
                System.out.println("You won $"+(amount * 2)+".\n");
            }else{
                System.out.println("You won $0.\n");
            }

            System.out.print("Do you want to play (y/n): ");
            choice = in.next().charAt(0);
        }

        System.out.println("\n");
        System.out.println("Entered Amount: $" + amount);
        System.out.println("Won Amount: $" + won);
        System.out.println("----------------------------");
        System.out.println("Total Amount: $" + (won + amount));
    }

    private static String getFruit(int guessNumber){
        switch(guessNumber){
            case 0:
            return "cherries";
            case 1:
            return "orange";
            case 2:
            return "plums";
            case 3:
            return "bells";
            case 4:
            return "mellons";
            default:
                return "";
        }
    }
}