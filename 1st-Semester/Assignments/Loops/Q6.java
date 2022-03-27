import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int dec;

		System.out.print("Enter Decimal Number: ");

		dec = in.nextInt();

		System.out.println("Hexa Number:   " + Integer.toHexString(dec));

		System.out.println("Octa Number:   " + Integer.toOctalString(dec));

		System.out.println("Binay Number:   " + Integer.toBinaryString(dec));

	}

}