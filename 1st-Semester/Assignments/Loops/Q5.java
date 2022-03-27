import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        char ch;

        int ascii,letters, spaces, numbers, specialCh, alphabets;
        letters = spaces = numbers = specialCh = alphabets = 0;

        System.out.print("Enter a string: ");
        str = in.next();

        int i = 0;
        int len = str.length();
        while(i < len){
            ch = str.charAt(i);
            ascii = (int)ch;
            if(ascii == 32){
                spaces++;
            }else if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                letters++;
            }else if(ascii >= 48 && ascii <= 57){
                numbers++;
            }else{
                specialCh++;
            }
            i++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + specialCh);
    }
}
