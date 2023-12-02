// divide and conquer approach
public class MaximumSubArray {

    public static void main(String[] args) {
        // int[] nums = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int[] nums = {-5, 4, 6, -3, 4, -1};
        System.out.print("Array: ");
        display(nums);
        System.out.println();

        // return (start, low, high)
        int[] result = findMaxSubArray(nums, 0, nums.length - 1);
        System.out.println("The starting index of the maximum subarray is: " + result[0]);
        System.out.println("The ending index of the maximum subarray is: " + result[1]);
        System.out.println("Maximum Subarray sum is: " + result[2]);
    }

    public static int[] findMaxCrossingSubArray(int[] arr, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = 0;

        for (int i = mid; i >= low; i--) {
            sum = sum + arr[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = 0;

        for (int j = mid + 1; j <= high; j++) {
            sum = sum + arr[j];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }
        
        // return (low, high, sum)
        return new int[]{maxLeft, maxRight, leftSum + rightSum};
    }

    public static int[] findMaxSubArray(int[] arr, int low, int high) {
        if (high == low) {
            return new int[]{low, high, arr[low]};
        } else {
            int mid = (low + high) / 2;

            int[] left = findMaxSubArray(arr, low, mid);
            int[] right = findMaxSubArray(arr, mid + 1, high);
            int[] cross = findMaxCrossingSubArray(arr, low, mid, high);

            System.out.print("Cross: ");
            display(cross);

            if (left[2] >= right[2] && left[2] >= cross[2]) {
                return left;
            } else if (right[2] >= left[2] && right[2] >= cross[2]) {
                return right;
            } else {
                return cross;
            }
        }
    }

    static void display(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
