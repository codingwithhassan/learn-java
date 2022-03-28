import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s, e, i, j, count, countPrime;

		System.out.print("Enter start number: ");
		s = in.nextInt();
		System.out.print("Enter ending number: ");
		e = in.nextInt();

		System.out.print("Prime Numbers : ");

		countPrime = 0;
		for (i = s; i <= e; i++) { // start outer loop
			count = 0;
			for (j = 2; j < i; j++) { // start inner loop
				if (i % j == 0)
					count++;
			} // end inner loop
			if (count == 0){
				System.out.print(i + " ");
				countPrime++;
			}

		} // end outer looop

		System.out.println();

		System.out.println(countPrime + " total prime numbers");

	}
}