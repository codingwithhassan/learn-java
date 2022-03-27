package Q10;
import java.util.Scanner;
public class III {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        
        System.out.print("Enter the No. of Rows for Pyramid of digits: ");
        r = in.nextInt();

        int i = 1,spaces,k,j;
        while(r >= i){

            spaces = r;
            while(spaces > i){
                System.out.print(" ");
                spaces--;
            }

            k = spaces;
            while(k < spaces + i ){
                System.out.print(k);
                k++;
            }

            j = k - 1;
            while(j > i){
                System.out.print(j - 1);
                j--;
            }
            
            System.out.println();
            i++;
        }
    }
}
