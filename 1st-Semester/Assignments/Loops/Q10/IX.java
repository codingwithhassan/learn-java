package Q10;
import java.util.Scanner;
public class IX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        
        System.out.print("Enter the number of rows: ");
        r = in.nextInt();

        int i = 0,j,left;
        while(i < r){
            
            left = i;
            while(left > 0)
                System.out.print(left-- + " ");
            
            j = 0;
            while(j < r - i){
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
