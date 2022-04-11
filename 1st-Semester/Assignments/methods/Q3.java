import java.util.Scanner;

public class Q3 {
    public static String toBinary(int num){
        String binNum = "";
        while(num != 0){
            int rem = num % 2;
            num /= 2;
            binNum = rem + binNum;
        }
        return binNum;
    }

    public static boolean isPrime(int n){
        int sqrt = (int)Math.sqrt(n);
        int i = 2;
        while(i <= sqrt)
            if(n % i++ == 0)
                return false;
        return true;
    }

    public static String fibonacci(int n){
        String series = "0 1 ";
        int i = 0;
        long n1 = 0;
        long n2 = 1;
        while(i++ < n - 2){
            long n3 = n1 + n2;
            series += n3 + " ";
            n1 = n2;
            n2 = n3;
        }
        return series;
    }

    public static int reverse(int n){
        int reverse = 0;
        while(n != 0){
            reverse *= 10;
            int last = n % 10;
            reverse += last;
            n /= 10;
        }
        return reverse;
    }
    
    public static int GCD(int n1, int n2){
        while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }else{
                n2 = n2 - n1;
            }
        }
        return n1;
    }

    public static double LCM(int n1, int n2){
        return n1 * n2 / GCD(n1, n2);
    }

    public static int max(int n1, int n2, int n3, int n4, int n5){
        return Math.max(n5,Math.max(n4,Math.max(n3,Math.max(n1, n2))));
    }

    public static int min(int n1, int n2, int n3, int n4, int n5){
        return Math.min(n5,Math.min(n4,Math.min(n3,Math.min(n1, n2))));
    }

    public static boolean isEven(int n){
        if(n % 2 == 0)
            return true;
        return false;
    }

    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    
    public static int diffInMinutes(int hour1, int minute1, int hour2, int minute2){
        minute1 += hour1 * 60;
        minute2 += hour2 * 60;

        return (int)Math.abs(minute1 - minute2);
    }

    public static boolean isPalindrome(int n){
        if(n == reverse(n))
            return true;
        return false;
    }

    public static String joinString(String str1, String str2){
        return str1 + str2;
    }

    public static void printStars(int rows, int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printStars(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println("Binary Number: " + toBinary(num));

        if(isPrime(num))
            System.out.println("Prime Number!");
        else
            System.out.println("Not a Prime Number!");

        
        if(isEven(num))
            System.out.println("Even Number!");
        else
            System.out.println("Not a Even Number!");


        System.out.println("Fibonacci: " + fibonacci(num));
        System.out.println("Reverse Number: " + reverse(num));
        System.out.println("Is Number Palindrome: " + isPalindrome(num));

        
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("GCD: " + GCD(num, num2));
        System.out.println("LCM: " + LCM(num, num2));

        System.out.println("Max Number : " + max(3,5,45,34,3));
        System.out.println("Min Number : " + min(3,5,45,34,3));

        swap(num, num2);
        
        System.out.println("Difference In Minutes: " + diffInMinutes(2, 30, 2, 15)); // 15

        String cont = joinString("Muhammad ","Hassan");
        System.out.println(cont);


        printStars(4, 5);

        printStars(5);
    }
}
