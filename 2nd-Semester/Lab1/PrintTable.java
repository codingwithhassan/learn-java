import java.util.Scanner;

class PrintTable{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter number to print table: ");
		int num = in.nextInt();
		while(num <= 0){
			System.out.print("Invalid!\nEnter number again to print table: ");
			num = in.nextInt();
		}

		printTable(num);
	}

	public static void printTable(int num){
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(num + " x " + i + " = " + i * num);
		}
	}
}