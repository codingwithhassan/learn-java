import java.util.Scanner;
public class NumberTypeLab5{
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = read.nextDouble();
		if(num % 1 == 0)
			System.out.print(num + " is Integer Number");
		else
			System.out.print(num + " is Real Number");
	}
}