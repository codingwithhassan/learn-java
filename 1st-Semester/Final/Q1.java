import java.util.Scanner;

public class Q1 {
    public static int max(int nums[]) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter %d number: ",i + 1);
            nums[i] = in.nextInt();
        }

        int max = max(nums);

        for (int i = 0; i < 5; i++) {
            if(max == nums[i])
                nums[i] = 0;
        }

        System.out.println("\n2nd Maximum Number: " + max(nums));
        
    }
}
