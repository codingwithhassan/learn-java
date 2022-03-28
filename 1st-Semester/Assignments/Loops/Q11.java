import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, s, e, i, sum, sumSeries, countEven, countOdd, countD;
		System.out.print("Enter a number:");
		n = in.nextInt();
		sumSeries = 0;
		countD = 0;
		countEven = 0;
		countOdd = 0;

		s = 0;
		e = 1;
		sum = 0;
		
		System.out.print("Series : 0 1 ");

		sumSeries += 0 + 1;
		countEven++;
		++countOdd;

		for (i = 0; i < n - 2; i++) {

			sum = s + e;
			s = e;
			e = sum;
			
			System.out.print(sum + " ");

			sumSeries += sum;

			if (sum % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}

			if (sum % 7 == 0) {
				countD++;
			}
		}
		System.out.println();

		System.out.println("Sum of series:    " + sumSeries);
		System.out.println("Total even number:  " + countEven);
		System.out.println("Total odd numbers:   " + countOdd);
		System.out.println("Divisible by digits:   " + countD);
	}
}