import java.util.Scanner;

public class Game{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = in.nextInt();

		if(num % 3 == 0 && num % 5 == 0)
			System.out.println("Fizz Buzz");
		else if(num % 5 == 0)
			System.out.println("Buzz");
		else if(num % 3 == 0)
			System.out.println("Fizz");
		else
			System.out.println("Nothing!");
	}
}