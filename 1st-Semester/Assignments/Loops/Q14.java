import java.util.Scanner;

public class Q14 {
    public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
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
            int count = 0;
            while (count < 10) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                }
               num++;
            }
        } else {
            System.out.println(num + " is not Prime Number");
            while (true) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    break;
                }
                num++;
            }
        }
    }
}
