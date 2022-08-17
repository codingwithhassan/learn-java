import java.util.Scanner;

public class ArraySumAverageByRowsLab4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = read.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = read.nextInt();

        int[][] arr = new int[rows][cols];

        fillArray(arr);
        printSumAverage(arr);
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

    static void printSumAverage (int[][] array){
        for (int i = 0; i < array.length; i++) {

            int sum = 0;
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }

            System.out.printf("Row at index %d:\n" , i);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + String.format("%.2f",sum / (double)count ) );
        }
    }
}
