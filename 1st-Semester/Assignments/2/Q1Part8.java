import java.util.Scanner;

public class Q1Part8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I Love Pakistan");
        System.out.print("Press Y to clear screen\nPress N for No\n:");
        char choice = sc.next().charAt(0);

        if(choice == 'y' || choice == 'Y'){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }else
            System.out.println("You are Wonderful Person.");
    }
}