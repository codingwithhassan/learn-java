import java.util.Scanner;

public class qs4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, a, b, c, d, e, count, x, i, sum, result, j, factorial, k, total;
		count = 0;
		System.out.println("enter a number:    ");
		n = in.nextInt();
		sum = 0;
		total = 0;
		if (n < 1000) {
			x = n;
			a = n / 1000;
			n = n % 1000;
			b = n / 100;
			n = n % 100;
			c = n / 10;
			n = n % 10;
			d = n / 1;
			n = x;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);

		} else {
			System.out.println("Invalid Button");
		}
		if (n % 2 == 0) {
			count++;
		}
		if (count == 0)
			System.out.println("Prime number");
		else
			System.out.println("not prime number");

		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (sum == n)
			System.out.println("\b\b\nPerfect Number");
		else
			System.out.println("not Perfect Number");

		for (j = 1; j <= 10; j++) {
			result = n * j;
			System.out.println(n + "x" + j + "=" + result);
		}
		factorial = 1;
		for (k = 1; k <= n; k++) {
			factorial = factorial * k;
		}
		System.out.println("factorial is:   " + factorial);
		if (factorial % 2 == 0) {
			System.out.println("even factorial");
		} else {
			System.out.println("odd factorial");
		}

	}
}