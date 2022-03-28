import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int terms, base, r, q, num, i;
		String output;

		System.out.print("Enter a Base : ");

		base = in.nextInt();

		System.out.print("Enter a Terms : ");

		terms = in.nextInt();

		System.out.println("The Numbers in base " + base + " are:   ");

		for (i = 1; i <= terms; i++) {

			num = i;
			output = "";
			while(num >= base){
				r = (int)num%base;
				num /= base;
				output = r + output;
			}
			output = num + output;

			System.out.print(output + "  ");

		}
	}

}
