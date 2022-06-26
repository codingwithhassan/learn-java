import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int s = in.nextInt();
        String strArray[] = new String[s];

        for (int i = 0; i < s; i++) {
            System.out.printf("Enter %d sentence:\n",i + 1);
            strArray[i] = in.next();
        }

        System.out.println("OUTPUT: ");
        for (int i = 0; i < s; i++) {
            String str = strArray[i];
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);

            if(start == end){
                System.out.println(str);
            }
        }
    }
}