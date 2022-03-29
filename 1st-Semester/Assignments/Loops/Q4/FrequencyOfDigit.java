package Q4;

import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num;
        System.out.print("Enter a number: ");
        num = in.next();
        char ch;
        int i = 0,j,count;
        while(i < num.length()){
            ch = num.charAt(i);
            count = j = 0;
            while(j < num.length()){
                if(ch == num.charAt(j))
                    count++;
                j++;
            }

            System.out.println(ch + " => " + count);
            i++;
        }
    }
}
