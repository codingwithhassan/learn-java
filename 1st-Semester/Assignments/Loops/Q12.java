import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n1, n2, product, hcf, lcm;

		System.out.print("Enter the 1st number");

		n1 = in.nextInt();

		System.out.print("Enter the 2nd number");

		n2 = in.nextInt();

		product = n1 * n2;

		while (n1 != n2) {

			if (n1 > n2) {

				n1 = n1 - n2;

			} else {

				n2 = n2 - n1;

			}

		}

		hcf = n2;
		lcm = product / hcf;

		System.out.println("HCF is: " + hcf);
		System.out.println("LCM is: " + lcm);

	}

}
