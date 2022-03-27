import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int terms, base, r, q, num, i;

		System.out.print("Enter a Terms : ");

		terms = in.nextInt();

		System.out.print("Enter a Base : ");

		base = in.nextInt();

		System.out.println("The Numbers in base   " + base + " are:   ");

		for (i = 1; i <= terms; i++) {

			r = i % base;

			q = i / base;

			num = (q * 10) + r;

			System.out.println(num + "  ");

		}
	}

}
