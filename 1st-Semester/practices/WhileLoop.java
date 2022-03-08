import java.util.Scanner;
public class WhileLoop{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int start, end, count = 0;

        System.out.print("Enter starting number: ");
        start = in.nextInt();

        System.out.print("Enter ending number: ");
        end = in.nextInt();

        while(start <= end){
            if(start % 2 == 0){
                System.out.println(start);
                count++;
            }
            start++;
        }

        System.out.println("Total Even Numbers: " + count);
    }
}