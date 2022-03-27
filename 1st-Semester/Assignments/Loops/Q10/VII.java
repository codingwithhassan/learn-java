package Q10;
import java.util.Scanner;
public class VII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        
        System.out.print("Enter the number of rows: ");
        r = in.nextInt();

        int i = 1,j;
        while(i <= r){
            j = 1;
            while(j <= i){
                System.out.print(j * i + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
