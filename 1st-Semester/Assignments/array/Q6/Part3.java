package Q6;
import java.util.Scanner;

public class Part3 {
    public static int countValue(int[] a, int n) {
        int i, count, length;
        boolean isTrue = true;
        count = 0;
        for (i = 0; i < a.length; i++) {
            if (n == a[i]) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[6];
        int i, num, count;
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter the Arrys Elements:  ");
            a[i] = in.nextInt();
        }
        System.out.print("Enter the Serching value:  ");
        num = in.nextInt();
        count = countValue(a, num);
        if (count > 0) {
            System.out.println("occurrence of value in Array is:  " + count);
        }

    }
}