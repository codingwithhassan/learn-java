import java.util.Scanner;
public class WhileLoops3Lab7{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n,i = 0;
		long sum = 0;
		while(i++ < 15){
			System.out.print("Enter a number: ");
			n = in.nextInt();
			sum += n;
		}

		System.out.println("Sum is : " + sum);
		System.out.println("Average is : " + sum / 15);
	}
}