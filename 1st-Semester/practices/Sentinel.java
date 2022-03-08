import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 0, num, count = 0;
        long sum = 0;

        while (i++ < 250) {
            System.out.print("Enter a number: ");
            num = in.nextInt();
            sum += num;

            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Total Even Numbers: " + count);
    }
}
