package Q10;
import java.util.Scanner;
public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        
        System.out.print("Enter the number of rows: ");
        r = in.nextInt();

        int i = 0,j,spaces;
        while(i < r){
            
            spaces = 0;
            while(spaces < i){
                System.out.print("  ");
                spaces++;
            }
            
            j = 1;
            while(j <= r - i){
                System.out.print(j+" ");
                j++;
            }

            j = r - i - 1;
            while(j >= 1){
                System.out.print(j+" ");
                j--;
            }

            System.out.println();
            i++;
        }

    }
}
