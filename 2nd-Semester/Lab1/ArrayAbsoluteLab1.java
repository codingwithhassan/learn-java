import java.util.Scanner;
public class ArrayAbsoluteLab1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = in.nextInt();

		int nums[] = new int[size];
		// int nums[] = {23, 56, 90};
		fillArray(nums);
	}

	public static void fillArray(int[] array){
		Scanner read = new Scanner(System.in);
		for (int i = 0; i < array.length ; i++) {
			System.out.print("Enter number for "+ i +" position for array: ");
			array[i] = read.nextInt();
		}

		absoluteArray(array);
	}

	public static void absoluteArray(int[] array){
		for (int i = 0; i < array.length ; i++) {
			array[i] = Math.abs(array[i]);
		}

		printArray(array);
	}

	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}