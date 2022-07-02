import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOSecondSmallestLargestLab3 {

    private static int getSize(File file) {
        int couter = 0;
        try {
            Scanner readFile = new Scanner(file);

            while (readFile.hasNext()) {
                readFile.next();
                couter++;
            }

            readFile.close();
        } catch (IOException e) {
            return 0;
        }

        return couter;
    }

    public static void main(String args[]) throws IOException {
        File file = new File("input-4-3.txt");
        Scanner readFile = new Scanner(file);

        int couter = getSize(file);
        int array[] = new int[couter];

        for (int i = 0; i < couter; i++) {
            array[i] = Integer.parseInt(readFile.next());
        }

        FileWriter writeFile = new FileWriter("output-4-3.txt");

        writeFile.write("Second Smallest: " + getSecondSmallestNumber(array));
        writeFile.write("\n");
        writeFile.write("Second Largest: " + getSecondLargestNumber(array));

        writeFile.close();
        readFile.close();
    }

    public static int getSecondSmallestNumber(int[] array) {
        int smallest = smallest(array);
        int small = array[0];
        for (int i = 1; i < array.length; i++) {
            if (small > array[i] && smallest != array[i])
                small = array[i];
        }
        return small;
    }

    public static int getSecondLargestNumber(int[] array) {
        int largest = largest(array);
        int large = array[0];
        for (int i = 1; i < array.length; i++) {
            if (large < array[i] && largest != array[i])
                large = array[i];
        }
        return large;
    }

    private static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i])
                smallest = array[i];
        }
        return smallest;
    }

    private static int largest(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (largest < array[i])
                largest = array[i];
        }
        return largest;
    }
}