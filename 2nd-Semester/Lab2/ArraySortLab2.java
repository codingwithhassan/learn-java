public class ArraySortLab2 {
    public static void main(String[] args) {
        InputArray arr = new InputArray();
        System.out.print("Enter the length of array: ");
        arr.setLength(arr.read.nextInt());
        while (true) {
            arr.fillArrayWithPrompt("Enter 0,1 or 2 at %d position :");

            if (isValidArray(arr.getArray())) {
                sortArrayZeroOneTwo(arr.getArray());
                break;
            } else {
                System.out.println("Invalid Valid!\nArray must contains only 0, 1 and 2 values.\nEnter Valid Values Again!\n");
                continue;
            }
        }
    }

    static void sortArrayZeroOneTwo(int[] array) {
        int sorted[] = new int[array.length];
        int counter = 0;

        // insert 0 values
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                sorted[counter++] = array[i];
        }

        // insert 1 values
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                sorted[counter++] = array[i];
        }

        // insert 2 values
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2)
                sorted[counter++] = array[i];
        }

        printArray(sorted);
    }

    static boolean isValidArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            if (val != 0 &&
                    val != 1 &&
                    val != 2)
                return false;
        }
        return true;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
