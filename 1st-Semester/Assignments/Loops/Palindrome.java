import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int tmp = Math.abs(num); // number will be positive if negative

        int reverse,digit,max,min;
        reverse = max = 0;
        min = -1;
        while(tmp != 0){
            reverse *= 10;
            digit = tmp%10;
            
            if(digit > max){
                max = digit;
            }
            
            if(min == -1){
                min = digit;
            }else if(digit < min){
                min = digit;
            }

            reverse += digit;
            tmp /= 10;
        }

        if(reverse == Math.abs(num)){
            System.out.println(num + " is Palindrome.");
            System.out.println("Largest digit is "+ max);
        }else{
            System.out.println(num + " is not Palindrome.");
            System.out.println("Smallest digit is "+ min);
        }
    }
}
