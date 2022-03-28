import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int dec,hex,oct,bin,
			rem;
		String hexAns, octAns, binAns;
		hexAns = octAns = binAns = "";

		System.out.print("Enter Decimal Number: ");

		dec = in.nextInt();

		hex = oct = bin = dec;

		while(hex >= 16){
			rem = (int)hex%16;
			hex /= 16;
			hexAns = rem + hexAns;
		}
		hexAns = hex + hexAns;

		while(oct >= 8){
			rem = (int)oct%8;
			oct /= 8;
			octAns = rem + octAns;
		}
		octAns = oct + octAns;

		while(bin >= 2){
			rem = (int)bin%2;
			bin /= 2;
			binAns = rem + binAns;
		}
		binAns = bin + binAns;

		System.out.println("Hexa Number:   " + hexAns);

		System.out.println("Octa Number:   " + octAns);

		System.out.println("Binay Number:   " + binAns);

	}

}