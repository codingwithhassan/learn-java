import java.util.Scanner;

public class qs11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, s, e, i, sum, sumSeries, countEven, countOdd, countD, j;
		System.out.print("enter a number:    ");
		n = in.nextInt();
		countD = 0;
		countEven = 0;
		countOdd = 0;
		i = 1;
		s = 0;
		e = 1;
		sum = 0;
		sumSeries = 0;
		System.out.println(s);
		System.out.println(e);
		for (i = 1; i <= n - 2; i++) {
			sum = s + e;
			sumSeries += sum;
			s = e;
			e = sum;
			System.out.println(sum);
			if (sum % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		for (j = 1; j <= n; j++) {
			if (n % j == 0) {
				countD++;
			}
		}
		System.out.println("sum of series:    " + sumSeries);
		System.out.println("total even number:  " + countEven);
		System.out.println("total odd numbers:   " + countOdd);
		System.out.println("divisible by digits:   " + countD);

	}
}