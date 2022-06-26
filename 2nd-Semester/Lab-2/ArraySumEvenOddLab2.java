import java.util.Scanner;

public class ArraySumEvenOddLab2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int len = s.nextInt();

        InputArray inputArray = new InputArray();
        inputArray.initArray(len);

        sumEvenOdd(inputArray.getArray());
    }    

    static void sumEvenOdd(int[] array){
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
                sumEven += array[i];
            else
                sumOdd += array[i];
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
