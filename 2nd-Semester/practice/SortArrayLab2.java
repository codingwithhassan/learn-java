import java.util.Scanner;

public class SortArrayLab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int len = input.nextInt();

        int array[] = new int[len];

        inputArray(array);

        if (isValid(array)) {
            printArray( sort(array) );
        } else {
            System.out.println("Invalid Array!");
        }
    }

    public static void inputArray(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter digit at %d of array: ", i);
            array[i] = input.nextInt();
        }
    }

    public static boolean isValid(int array[]) {

        for (int i = 0; i < array.length; i++) {
            int elm = array[i];
            if (elm != 0 && elm != 1 && elm != 2) {
                return false;
            }
        }

        return true;
    }

    public static int[] sort(int array[]) {
        int sortedArr[] = new int[array.length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                sortedArr[counter++] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                sortedArr[counter++] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2)
                sortedArr[counter++] = array[i];
        }
        
        return sortedArr;
    }

    public static void printArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }

    }
}
