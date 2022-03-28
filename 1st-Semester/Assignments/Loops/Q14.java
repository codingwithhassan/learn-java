import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        boolean isPrime = true;

        int sqrt = (int) Math.sqrt(num);

        int i = 2;
        while (i <= sqrt) {
            if (num % i == 0) {
                isPrime = false;
            }
            i++;
        }

        if (isPrime) {
            System.out.println(num + " is Prime Number");
            int p = num;
            int count = 0, iteration;
            boolean isPrimeNum = true;
            int sqrtNum;
            while (count < 10) {
                iteration = 2;
                sqrtNum = (int) Math.sqrt(p);
                while (iteration <= sqrtNum) {
                    if (p % iteration == 0)
                        isPrimeNum = false;
                    iteration++;
                }
                if (isPrimeNum) {
                    System.out.print(p + " ");
                    count++;
                }

                p++;
            }
        } else {
            System.out.println(num + " is not Prime Number");
            int p = num;
            int count = 0, iteration;
            boolean isPrimeNum = true;
            int sqrtNum;
            while (count < 1) {
                iteration = 2;
                sqrtNum = (int) Math.sqrt(p);
                while (iteration <= sqrtNum) {
                    if (p % iteration == 0)
                        isPrimeNum = false;
                    iteration++;
                }
                if (isPrimeNum) {
                    System.out.print(p + " ");
                    count++;
                }

                p++;
            }
        }
    }
}
