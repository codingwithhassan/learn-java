public class ArrayPrintPrimesLab2 {
    public static void main(String[] args) {
        InputArray inputArray = new InputArray();

        System.out.print("Enter the length of array: ");

        inputArray.initArray( inputArray.read.nextInt() );

        printPrimes(inputArray.getArray());
    }

    public static void printPrimes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(isPrime(array[i]))
                System.out.print(array[i] + " ");
        }
    }

    static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
