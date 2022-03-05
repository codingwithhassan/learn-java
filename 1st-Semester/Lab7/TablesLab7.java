import java.util.Scanner;
public class TablesLab7{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int table = in.nextInt();

		System.out.print("Enter a start value:");
		int start = in.nextInt();

		System.out.print("Enter a end value:");
		int end = in.nextInt();

		while(start <= end)
			System.out.println(table + " x " + start + " = " + start++ * table);
		

	}
}