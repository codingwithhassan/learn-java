import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = new int[5];

        fillInput(array);

        printArray( reverseArray(array) );
    }
    
    public static void fillInput(int[] array) {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter value at %d position: " , i);
            array[i] = read.nextInt();
        }
    }

    public static int[] reverseArray(int[] array) {
        int reverseArray[] = new int[array.length];

        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[reverseArray.length - 1 - i] = array[i];
        }

        return reverseArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
