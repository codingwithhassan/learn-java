import java.util.Scanner;

public class Q4 {
    public static void show(char matrix[][]) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("| %c", matrix[i][j]);
            }
            System.out.println("|");
        }
    }

    public static boolean checked(char matrix[][], char turn) {
        if (matrix[0][0] == turn && matrix[0][1] == turn && matrix[0][2] == turn ||
                matrix[1][0] == turn && matrix[1][1] == turn && matrix[1][2] == turn ||
                matrix[2][0] == turn && matrix[2][1] == turn && matrix[2][2] == turn ||
                matrix[0][0] == turn && matrix[1][0] == turn && matrix[2][0] == turn ||
                matrix[0][1] == turn && matrix[1][1] == turn && matrix[2][1] == turn ||
                matrix[0][2] == turn && matrix[1][2] == turn && matrix[2][2] == turn ||
                matrix[0][0] == turn && matrix[1][1] == turn && matrix[2][2] == turn ||
                matrix[0][2] == turn && matrix[1][1] == turn && matrix[2][0] == turn)
            return true;
        return false;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char matrix[][] = {
                { '_', '_', '_' },
                { '_', '_', '_' },
                { '_', '_', '_' }
        };

        char turn = 'o';

        while (true) {
            show(matrix);
            System.out.println(turn + "'s Turn: ");
            int row,col;
            while (true) {
                System.out.print("Enter row (1-3) :");
                row = in.nextInt();
                while (row < 1 || row > 3) {
                    System.out.print("Invalid! Enter row (1-3) :");
                    row = in.nextInt();
                }
                System.out.print("Enter column (1-3) :");
                col = in.nextInt();
                while (col < 1 || col > 3) {
                    System.out.print("Invalid! Enter column (1-3) :");
                    col = in.nextInt();
                }

                if(matrix[row - 1][col - 1] == '_')
                    break;
                else
                    System.out.println("Not Allowed!");
            }

            matrix[row - 1][col - 1] = turn;

            if (checked(matrix, turn)) {
                show(matrix);
                System.out.println(turn + "'s Won!");
                break;
            }

            if (turn == 'o')
                turn = 'x';
            else
                turn = 'o';
        }
    }
}
