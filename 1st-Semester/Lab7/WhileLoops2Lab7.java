import java.util.Scanner;
public class WhileLoops2Lab7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		long sum;

		System.out.println("The sum of all even numbers between 10 and 100 (inclusive).");
		i = 10;
		sum = 0;
		while(i <= 100){
			if(i % 2 == 0)
				sum += i;
			i++;
		}
		System.out.println("Sum is : "+ sum);

		System.out.println("The average of all odd numbers between a and b (inclusive).");
		System.out.print("Enter a value: ");
		int a = sc.nextInt();
		System.out.print("Enter b value: ");
		int b = sc.nextInt();
		i = a;
		sum = 0;
		while(i <= b){
			if(i % 2 != 0)
				sum += i;
			i++;
		}
		int iterations = b - a;
		System.out.println("Average is : " + sum/iterations);

	}
}