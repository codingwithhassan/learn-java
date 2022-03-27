package Q10;
import java.util.Scanner;
public class VIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        
        System.out.print("Enter the number of rows: ");
        r = in.nextInt();

        int i = 0,j,print;
        while(i < r){
            j = 0;
            print = i;
            while(j <= i){
                System.out.print(print + " ");
                print += i + 1;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
