package Q10;
import java.util.Scanner;
public class X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        
        System.out.print("Enter number of rows: ");
        r = in.nextInt();

        int i = 0,j,k,l;
        while(i < r){

            j = 0;
            while(j < r - i){
                System.out.print("A");
                j++;
            }

            k = 0;
            while(k <= i){
                System.out.print("*.");
                k++;
            }

            System.out.println();
            i++;
        }

    }
}
