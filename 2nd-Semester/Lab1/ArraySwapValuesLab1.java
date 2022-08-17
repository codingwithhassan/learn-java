import java.util.Scanner;
public class ArraySwapValuesLab1{
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

		printArray( arraySwapValues(array) );
	}
	
	public static int[] arraySwapValues(int[] array){

		System.out.println("Before Swapping: ");
		printArray(array);

		int tmp = array[0];
		for (int i = 0; i < array.length - 1 ; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = tmp;

		System.out.println("After Swapping: ");
		return array;
	}

	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}