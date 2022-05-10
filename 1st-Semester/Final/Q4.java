import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int s = in.nextInt();
        System.out.println("Enter numbers in sequence: ");
        int nums[] = new int[s];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int temp;
        for (int i = 0; i < s / 2 ; i++) {
            temp = nums[i];
            nums[i] = nums[s - i - 1];
            nums[s - i - 1] = temp;
        }

        
        System.out.println("OUTPUT: ");
        for (int i = 0; i < s; i++) {
            System.out.print(nums[i] + " ");
        }
        
    }
}
