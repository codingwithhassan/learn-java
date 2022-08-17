import java.util.Scanner;
public class ArrayReverseLab1{
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

		printArray( reverseArray(array) );
	}

	public static int[] reverseArray(int[] array){
		int len = array.length;
		int[] reverse = new int[len];
		for (int i = 0,j = len - 1; i < len; i++, j--) {
			reverse[j] = array[i];
		}
		return reverse;
	}

	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}