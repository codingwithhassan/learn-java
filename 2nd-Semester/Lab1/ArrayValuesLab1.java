import java.util.Scanner;
public class ArrayValuesLab1{
    public static void main(String[] args){
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

		System.out.println("Smallest: " + smallest(array));
		System.out.println("Largest: " + largest(array));
		System.out.println("Middle: " + middle(array));
	}

    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(smallest > array[i])
                smallest = array[i];
        }
        return smallest;
    }

    public static int largest(int[] array){
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(largest < array[i])
                largest = array[i];
        }
        return largest;
    }

    public static double middle(int[] array){
        int len = array.length;
        if (len % 2 != 0) {
            return (double)array[(len / 2)];
        }
        return ( array[ (len / 2) - 1 ] + array[ (len / 2)]  ) / 2.0;
    }
}