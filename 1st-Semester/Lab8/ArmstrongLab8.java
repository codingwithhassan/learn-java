import java.util.Scanner;
public class ArmstrongLab8{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int digit , tempNum;
		tempNum = num;

		int conquer = (int)Math.log10(num);

		long sum = 0;

		int i = 0;
		while(i++ <= conquer){
			digit  = (int)tempNum%10;
			tempNum  /= 10;
			sum += Math.pow(digit,conquer + 1);
		}

		if(sum == num)
			System.out.println("The number is an Armstrong number.");
		else
			System.out.println("The number is not an Armstrong number.");
	}
}