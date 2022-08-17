public class ArrayIdentityMatrixLab4 {
    public static void main(String[] args) {

        int[][] array = {
                { 1, 0, 0},
                { 0, 1, 0},
                { 0, 0, 1}
        };

        System.out.println("Is Identity Matrix: " + isIdentityMatrix(array));
    }

    static boolean isIdentityMatrix(int[][] array) {
        boolean isIdentity = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    if (array[i][j] != 1)
                        isIdentity = false;
                } else {
                    if (array[i][j] != 0)
                        isIdentity = false;
                }
            }
        }

        return isIdentity;
    }
}
