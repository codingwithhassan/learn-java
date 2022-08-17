import java.util.Scanner;
public class ArraySumAverageLab1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = in.nextInt();

		int nums[] = new int[size];
		fillArray(nums);
	}

	public static void fillArray(int[] array){
		Scanner read = new Scanner(System.in);
		for (int i = 0; i < array.length ; i++) {
			System.out.print("Enter number for "+ i +" position for array: ");
			array[i] = read.nextInt();
		}

		printSumAverage(array);
	}

	public static void printSumAverage(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (double)sum / array.length);
	}
}