import java.util.Scanner;
public class WhileLoops1Lab8{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int counter = 0, number;
		long sum = 0, product = 1;

		while(counter++ < 15){
			System.out.print("Enter a number: ");
			number = in.nextInt();

			if(number % 3 == 0){
				product *= number;
			}else{
				sum += number;
			}
		}

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (sum / 15.0));
		System.out.println("Product: " + product);

	}
}