class QuickSortAnalysis {
    
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; 
        int i = low - 1; // Index of smaller element
        System.out.println("pivot: " + pivot);
        System.out.println("i: " + i);

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or equal to pivot
            System.out.println("Iteration: " + j);
            System.out.println("arr[j] <= pivot: " + (arr[j] <= pivot));
            if (arr[j] <= pivot) {
                i++; // increment index of smaller element
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println("swap when i => " + i + " and j => " + j +" : ");
                display(arr);
                System.out.println();
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);
            System.out.println("pi: " + pi + "\n");

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,8,7,1,3,5,6,4};
        display(arr);
        quickSort(arr, 0, arr.length - 1);
        
        display(arr);
    }
    
    static void display(int[] arr){
        for(int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }
}