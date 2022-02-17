import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a,b,c;
        int n1,n2,n3,n4,n5,n6;
        
        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();
        System.out.print("Enter third number: ");
        c = in.nextInt();

        n1 = a;
        n1 *= 10;
        n1 += b;
        n1 *= 10;
        n1 += c;

        n2 = b;
        n2 *= 10;
        n2 += a;
        n2 *= 10;
        n2 += c;

        n3 = c;
        n3 *= 10;
        n3 += a;
        n3 *= 10;
        n3 += b;

        n4 = a;
        n4 *= 10;
        n4 += c;
        n4 *= 10;
        n4 += b;

        n5 = b;
        n5 *= 10;
        n5 += c;
        n5 *= 10;
        n5 += a;

        n6 = c;
        n6 *= 10;
        n6 += b;
        n6 *= 10;
        n6 += a;

        System.out.println("Permutations of Numbers: ");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);

    }
}
