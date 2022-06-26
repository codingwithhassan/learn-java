import java.util.Scanner;
class Input{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = in.nextLine();
		System.out.print("Enter age: ");
		int age = in.nextInt();

		printData(name,age);
	}

	public static void printData(String name, int age){
		System.out.printf("Name: %s\nAge: %d",name,age);
	}
}