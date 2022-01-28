import java.util.Scanner;
public class Convert{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char letter = in.next().charAt(0);
        int num = letter;
        System.out.println("ASCII Code of " + letter + " is " + num);
    }
}