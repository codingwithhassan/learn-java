public class ArrayPrintUniqueLab2 {
    public static void main(String[] args) {
        InputArray arr = new InputArray();

        printUnique(arr.initArrayWithLenght());
    }

    public static void printUnique(int[] arr) {
        int[] unique = new int[arr.length];
        int counter = 0;
        unique[counter++] = arr[0];

        for (int i = 0; i < unique.length; i++) {
            if(!contains(unique, arr[i]))
                unique[counter++] = arr[i];
        }

        printArray(unique, counter);
    }

    public static boolean contains(int[] arr,int number) {
        for (int num : arr) {
            if(num == number)
                return true;
        }
        return false;
    }

    public static void printArray(int[] arr,int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
