/*
    --------------------------------------------------------------
    36 = 00100100 (In Binary)

    1's complement = 11011011

    2's complement:
    11011011
        +   1
    _________
    11011100
    --------------------------------------------------------------
 */
public class BitwiseOperators {
    public static void main(String[] args) {

        int a = 5,
                b = 7;

        /*
            Make truth table for 5 and 7 binaries to understand it
         */
        System.out.println("AND" + (a & b));
        System.out.println("OR" + (a | b));
        System.out.println("XOR" + (a ^ b)); // If Total number of 1 bits is odd it will be 1
        System.out.println("Complement" + (-a));

        int x = 25;
        System.out.println(x); // 1 1 0 0 1 . : 25

        // right shift operator
        // Remove bits from right
        // Add left-most bit to left if negative
        System.out.println(x >> 2); // 1 1 0 . : 6

        // unsigned right shift operator
        System.out.println(x >>> 2); // 1 1 0 . : 6

        // left shift operator
        // Add zero bits if positive and one bits if negative to right
        System.out.println(x << 2); // 1 1 0 0 1 0 0 . : 100

        // * In Java, negative number stores as 2's complement
        int k = -8; // -1000
        System.out.println(k >> 1);
        System.out.println(k >>> 1);
    }
}