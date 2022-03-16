import java.util.Scanner;
public class PrimeNumberMethod2Lab8{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = in.nextInt();

		int i = 2;

		boolean isPrime = true;

		while(i < num){
			if(num % i == 0){
				isPrime = false;
			}
			i++;
		}

		if(isPrime)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}
}