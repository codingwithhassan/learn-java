public class ArrayNegativeBeforePositiveLab1 {
    public static void main(String[] args) {
        int array[] = {2,0,-23,39,-3,-2,59,38,1};

        System.out.println("Before Swapping");
        printArray(array);
        int swapArray[] = negativeBeforePositive(array);
        System.out.println("After Swapping");
        printArray(swapArray);
    }

    public static int[] negativeBeforePositive(int[] array){
        int[] swapArray = new int[array.length];
        int c =0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                swapArray[c++] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0)
                swapArray[c++] = array[i];
        }

        return swapArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("__");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
