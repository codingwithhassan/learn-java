public class ArraySumOfMiddleColumnsLab4 {
    public static void main(String[] args) {

        int[][] array = {
                { 5, 7, 9, 4, 3, 3 },
                { 2, 4, 9, 7, 6, 5 },
                { 3, 6, 8, 7, 9, 4 },
                { 1, 9, 7, 5, 6, 9 },
                { 3, 8, 7, 9, 2, 2 },
                { 3, 8, 7, 9, 2, 2 }
        };

        System.out.println("Sum: " +
        getSumOfMiddleColumns(array));
    }

    static double getSumOfMiddleColumns(int[][] array){
        double sum = 0;

        if(array.length % 2 == 0){
            int mid = (array[0].length / 2) - 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = mid; j <= mid + 1; j++) {
                    sum += array[i][j];
                }
            }
        }else{
            for (int j = 0; j < array[ array[0].length / 2 ].length; j++) {
                sum += array[j][array[0].length / 2];
            }
        }

        return sum;
    }
}
