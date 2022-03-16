import java.util.Scanner;
public class WhileLoops2Lab8{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int counter = 0,
			number,evenCount = 0, oddCount = 0;

		while(counter++ < 20){
			System.out.print("Enter a number: ");
			number = in.nextInt();

			if(number % 3 == 0)
				oddCount++;
			else
				evenCount++;
		}

		System.out.print("Even: " + evenCount +"\nOdd: "+ oddCount);
	}
}