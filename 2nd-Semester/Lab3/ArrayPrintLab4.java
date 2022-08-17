import java.util.Scanner;
public class ArrayPrintLab4{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = read.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = read.nextInt();

        int[][] array = new int[rows][cols];

        fillArray(array);
        printArray(array);
    }
    
    public static void fillArray(int[][] array) {
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter value[%d][%d]: ",i,j);
                array[i][j] = read.nextInt();
            }
        }
    }

    static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}