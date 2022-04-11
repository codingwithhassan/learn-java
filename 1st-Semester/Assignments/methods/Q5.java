import java.util.Scanner;
public class Q5{
    public static int gcd(int n1, int n2){
        if(n1 == n2)
            return n1;
        if(n1 > n2)
            return gcd(n1 - n2, n2);
        else
            return gcd(n1,n2 - n1);
    }
    
    public static int factorial(int n){
        if(n == 1)
            return n;
        return n * factorial(n - 1);
    }

    public static String fibonacci(int n){
        String series = "0 1 ";
        int n1 = 0;
        int n2 = 1;
        int i = 0;
        while(i < n - 2){
            int n3 = n1 + n2;
            series += n3 + " ";
            n1 = n2;
            n2 = n3;
            i++;
        }
        return series;
    }

    public static int sum(int n){
        if(n == 0)
            return n;
        return n + sum(n - 1);
    }

    public static boolean isPrime(int n, int i){
        if(n < 2)
            return false;
        else if(n == 2 || n == 3)
            return true;
        else if (n == i)
            return true;
        else if(n % i == 0)
            return false;
        return isPrime(n, i + 1);
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.printf("Greatest Common Divisor of %d and %d is %d\n",num1,num2,gcd(num1, num2)); // or hcf
        
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Factorial : "+ factorial(num));
        System.out.println("Sum : "+ sum(num));
        System.out.println("Fibonacci : "+ fibonacci(num));
        System.out.println("Is Prime? : "+isPrime(num,2));
        System.out.println("Is Even? : "+isEven(num));
    }
}