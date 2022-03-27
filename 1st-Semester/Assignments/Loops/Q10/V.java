package Q10;
import java.util.Scanner;
public class V {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r,bin;
        
        System.out.print("Input number of rows for Floyd's Triangle: ");
        r = in.nextInt();

        int i = 0,j;
        while(i < r){
            
            bin = i % 2 == 0 ? 1 : 0;

            j = i;
            while(j >= 0){
                System.out.print(bin + " ");
                bin = bin == 1 ? 0 : 1;
                j--;
            }
            
            System.out.println();
            i++;
        }

    }
}
