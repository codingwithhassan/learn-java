import java.util.Scanner;
public class SumIntegersLab7{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = in.nextInt();

		int i = 1;
		long sum = 0;
		while(i < n){
			if(i % 2 != 0)
				sum += i;
			i++;
		}

		System.out.println("Sum is : " + sum);
	}
}