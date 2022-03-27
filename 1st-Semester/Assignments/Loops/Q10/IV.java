package Q10;
import java.util.Scanner;
public class IV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        char letter;
        
        System.out.print("Enter the No. Letters in the Pyramid: ");
        r = in.nextInt();

        int i = 1,s,j,k;
        while(i <= r){
            letter = 'A';

            s = r;
            while(s > i){
                System.out.print(" ");
                s--;
            }

            j = 1;
            while(j <= i){
                System.out.print(letter++);
                j++;
            }
            letter--;

            k = 1;
            while(k < i){
                System.out.print(--letter);
                k++;
            }
            
            System.out.println();
            i++;
        }

    }
}
