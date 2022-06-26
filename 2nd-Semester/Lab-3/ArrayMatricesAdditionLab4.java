public class ArrayMatricesAdditionLab4 {
    public static void main(String[] args) {
        
        int[][] firstMatrix = {
                { 5, 7, 9, 4, 3, 3 },
                { 2, 4, 9, 7, 6, 5 },
                { 3, 6, 8, 7, 9, 4 },
                { 1, 9, 7, 5, 6, 9 },
                { 3, 8, 7, 9, 2, 2 },
                { 3, 8, 7, 9, 2, 2 }
        };
        int[][] secondMatrix = {
                { 5, 7, 9, 4, 3, 3 },
                { 2, 4, 9, 7, 6, 5 },
                { 3, 6, 8, 7, 9, 4 },
                { 1, 9, 7, 5, 6, 9 },
                { 3, 8, 7, 9, 2, 2 },
                { 3, 8, 7, 9, 2, 2 }
        };

        printArray(
            addMatrices(firstMatrix, secondMatrix)
        );
    }

    static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int sum[][] = new int[firstMatrix.length][secondMatrix[0].length];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        return sum;
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
