import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch1,ch2;

        System.out.print("Enter first character: ");
        ch1 = in.next().charAt(0);
        System.out.print("Enter second character: ");
        ch2 = in.next().charAt(0);

        if(
            ch1 == 'A' ||
            ch1 == 'a' ||
            ch1 == 'E' ||
            ch1 == 'e' ||
            ch1 == 'I' ||
            ch1 == 'i' ||
            ch1 == 'O' ||
            ch1 == 'o' ||
            ch1 == 'U' ||
            ch1 == 'u'
        ){
            System.out.println(ch1 + " is vowel.");
        }else{
            System.out.println(ch1 + " is constant.");
        }

        if(
            ch2 == 'A' ||
            ch2 == 'a' ||
            ch2 == 'E' ||
            ch2 == 'e' ||
            ch2 == 'I' ||
            ch2 == 'i' ||
            ch2 == 'O' ||
            ch2 == 'o' ||
            ch2 == 'U' ||
            ch2 == 'u'
        ){
            System.out.println(ch2 + " is vowel.");
        }else{
            System.out.println(ch2 + " is constant.");
        }

        if(ch1 == ch2 || ch1 - 32 == ch2 || ch1 + 32 == ch2)
            System.out.println("Both characters are equal.");
        else
            System.out.println("Both characters are not equal.");

        int ch1code = ch1;
        int ch2code = ch2;
        System.out.println("Implicit Casting:");
        System.out.print(ch1code + " code of " + ch1 +"\n" + ch2code + " code of " + ch2);
        
        System.out.println(); // break the line
        
        System.out.println("Explicit Casting:");
        System.out.print((int)ch1 + " code of " + ch1 +"\n" + (int)ch2 + " code of " + ch2);

        char previous = (char)((int)ch1 - 1);
        char next = (char)((int)ch2 + 1);

        System.out.print("\nPrevious Character of first character: "+previous+"\nNext Character of second character: "+next);
    }
}
