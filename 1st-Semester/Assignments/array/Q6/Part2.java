package Q6;
import java.util.Scanner;

public class Part2 {
    public static boolean searchValue(int[] a, int n) {
        int i, count;
        count = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[6];
        int i, num;
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter the Arrys Elements:  ");
            a[i] = in.nextInt();
        }
        System.out.print("Enter the Serching value:  ");
        num = in.nextInt();
        if (searchValue(a, num)) {
            System.out.print("True");

        } else {
            System.out.print("False");
        }
    }
}