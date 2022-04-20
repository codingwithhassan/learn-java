import java.util.Scanner;

public class Q5 {
    private static int[][] inputMatrix(Scanner in) {
        System.out.print("Enter rows: ");
        int r = in.nextInt();
        System.out.print("Enter columns: ");
        int c = in.nextInt();

        int matrix[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter value at %d column of %d row: ", j, i);
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("\n");
        return matrix;
    }

    private static void show(int[][] matrix){
        int i,j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void show(int[][] A, int[][] B, int[][] result){
        System.out.println("Matrix A:");
        show(A);
        System.out.println("Matrix B:");
        show(B);
        System.out.println("Result Matrix:");
        show(result);
    }

    public static void addMatrix(int[][] A, int[][] B) {
        int rA,cA, rB,cB,i,j;
        rA = A.length;
        cA = A[0].length;
        rB = B.length;
        cB = B[0].length;

        if(rA == rB && cA == cB){
            int C[][] = new int[rA][cA];
            for (i = 0; i < rA; i++) {
                for (j = 0; j < cA; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
            show(A, B,C);
        }else
            System.out.println("Addition of two matrix not possible!");
    }

    public static void subtractMatrix(int[][] A, int[][] B) {
        int rA,cA, rB,cB,i,j;
        rA = A.length;
        cA = A[0].length;
        rB = B.length;
        cB = B[0].length;

        if(rA == rB && cA == cB){
            int C[][] = new int[rA][cA];
            for (i = 0; i < rA; i++) {
                for (j = 0; j < cA; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
            show(A, B,C);
        }else
            System.out.println("Subtraction of two matrix not possible!");
    }

    public static void multiplyMatrix(int[][] A, int[][] B) {
        int rA,cA, rB,cB,i,j,k;
        rA = A.length;
        cA = A[0].length;
        rB = B.length;
        cB = B[0].length;

        if(cA == rB){
            int C[][] = new int[rA][cB];
            for (i = 0; i < rA; i++) {
                for (j = 0; j < cB; j++) {
                    C[i][j] = 0;
                    for(k = 0; k < rA; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            show(A, B,C);
        }else
            System.out.println("Multiplication of two matrix not possible!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(
                "Press 1 for addition of two Matrices\nPress 2 for Subtraction of Two Matrices\nPress 3 for Multiplication of Two Matrices\nPress 4 for Exit.\n:");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                addMatrix(inputMatrix(in), inputMatrix(in));
                break;
            case 2:
                subtractMatrix(inputMatrix(in), inputMatrix(in));
                break;
            case 3:
                multiplyMatrix(inputMatrix(in), inputMatrix(in));
                break;
            case 4:
                System.out.println("Good Bye!");
                break;
            default:
                System.out.println("Incorrect Choice!");
        }
    }
}