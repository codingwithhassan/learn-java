public class Arrays {
    public static void main(String[] args) {

        int[] arr = new int[] { 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
 
        System.out.println("Array elements after sorting:");

        

    }

    public static int[] sort(int arr[]) {
        int[] sortedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

            System.out.println(arr[i]);
        }

        return sortedArr;
    }

    public static void print(int arr[]) {
        System.out.print("{");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.print("}");
    }
}