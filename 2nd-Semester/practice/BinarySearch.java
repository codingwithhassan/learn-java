public class BinarySearch {

    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

            // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    /**
     * Java method to perform binary search. It accept an integer array and a
     * number and return the index of number in the array. If number doesn't
     * exists in array then it return -1
     *
     * @param input
     * @param number
     * @return index of given number in array or -1 if not found
     */
    public static int performBinarySearch(int[] input, int number) {
        int low = 0;
        int high = input.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (input[middle] == number) {
                return middle;
            } else if (input[middle] < number) {
                low = middle + 1;
            } else if (input[middle] > number) {
                high = middle - 1;
            }
        }
        return -1;
    }

    public int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }

    public static int stringBinarySearch() {

        String[] a = { "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG" };
        int min = 0;
        int max = a.length - 1;
        int mid;
        String key = "CCC";

        while (min <= max) {
            mid = (min + max) / 2;
            if (a[mid].compareTo(key) < 0) {
                min = mid + 1;
            } else if (a[mid].compareTo(key) > 0) {
                max = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
