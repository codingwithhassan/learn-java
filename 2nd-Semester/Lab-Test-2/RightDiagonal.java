public class RightDiagonal {
    public static void main(String[] args) {
        int dataSet[][] = {
                { 5, 7, 9, 4, 3 },
                { 2, 4, 9, 7, 6 },
                { 3, 6, 8, 7, 9 },
                { 1, 9, 7, 5, 6 },
                { 3, 8, 7, 9, 2 },
        };

        int dataSet2[][] = {
            {5, 7, 9, 4, 3},
            {2, 4, 9, 7, 6},
            {3, 6, 8, 7, 9},
            {1, 9, 7, 5, 6},
        };

        System.out.println("Sum of right diagonal: " + getSumOfRightDiagonal(dataSet));
        System.out.println("Sum of right diagonal: " + getSumOfRightDiagonal(dataSet2));
    }

    static int getSumOfRightDiagonal(int[][] array) {

        int sum = 0;
        int len = array.length;

        if(len != array[0].length){
            System.out.println("number of rows and columns should be equal!");
            return -1;
        }

        for (int i = 0; i < len; i++) {
            sum = sum + array[i][ (len - 1) - i ];
        }

        return sum;
    }
}
