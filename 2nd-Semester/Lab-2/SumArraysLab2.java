public class SumArraysLab2 {
    public static void main(String[] args) {
        InputArray arr1 = new InputArray();
        InputArray arr2 = new InputArray();

        printArray(sumOfArrays(arr1.initArrayWithLenght(),arr2.initArrayWithLenght()));;
    }

    public static int[] sumOfArrays(int[] arrayA, int[] arrayB) {

        if(arrayA.length != arrayB.length){
            System.out.println("Math Error!\nBoth list must have sames length!");
            System.exit(0);
        }

        int[] sum = new int[arrayA.length];

        for (int i = 0; i < sum.length; i++)
            sum[i] = arrayA[i] + arrayB[i];

        return sum;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
