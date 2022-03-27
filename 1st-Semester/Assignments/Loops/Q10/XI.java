package Q10;
import java.util.Scanner;
public class XI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        
        System.out.print("Enter the number of rows: ");
        r = in.nextInt();

        int i = 1,j,k,l;
        while(i <= r){
            j = r;
            while(j > i){
                System.out.print(" ");
                j--;
            }
            k = i;
            while(k >= 1){
                System.out.print("*");
                k--;
            }
            l = r - 1;
            while(l > r -i ){
                System.out.print("*");
                l--;
            }
            i++;
            System.out.println();
        }

    }
}
