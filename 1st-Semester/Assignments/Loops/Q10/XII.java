package Q10;
import java.util.Scanner;
public class XII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        char letter = 'A';
        
        System.out.print("Enter the number of rows: ");
        r = in.nextInt();

        int i = 0,j,k;
        while(i < r){
            j = r;
            while(j > i){
                System.out.print(" ");
                j--;
            }
            k = i;
            while(k >= 0){
                System.out.print((char)(letter + k));
                k--;
            }

            i++;
            System.out.println();
        }

    }
}
