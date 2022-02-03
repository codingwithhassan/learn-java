import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int n, a, b, c, d, e, sum, x;
        //   System.out.print("Enter a number:   ");
        //   n=in.nextInt();
        n = 78692;
        x = n;
        a = n / 10000;
        n = n % 10000;
        b = n / 1000;
        n = n % 1000;
        c = n / 100;
        n = n % 100;
        d = n / 10;
        n = n % 10;
        e = n / 1;
        n = x;
        // 	sum=a+b+c+d+e;
        // 	System.out.println("Sum of all Digits is:  "+sum);
        System.out.println("You Entered The Number:   " + n);
        System.out.println("Number in Reverse Order is Following: ");
        System.out.print(e);
        System.out.print(d);
        System.out.print(c);
        System.out.print(b);
        System.out.print(a);
    }
}
