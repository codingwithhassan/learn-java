import java.util.Scanner;
public class PrimeNumberMethod1Lab8{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = in.nextInt();

		// if(num == 2){
		// 	System.out.println("Prime Number");
		// }else{
			int i = 2;
			double sqrt = (int)Math.sqrt(num);

			boolean isPrime = true;

			while(i <= sqrt){
				if(num % i == 0){
					isPrime = false;
				}
				i++;
			}

			if(isPrime)
				System.out.println("Prime Number");
			else
				System.out.println("Not Prime Number");
		// }
	}
}