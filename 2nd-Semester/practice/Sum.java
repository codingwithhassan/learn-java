import java.util.Scanner;

public class Sum{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int n1 = in.nextInt();

		System.out.print("Enter second number: ");
		int n2 = in.nextInt();

		System.out.println("Sum is " + sum(n1,n2));
	}

	public static int sum(int a, int b){
		return a + b;
	}

}