import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOStringPalindromeLab3 {
    public static void main(String[] args) throws IOException{
        File file = new File("input-7-3.txt");
        Scanner readFile = new Scanner(file);

        isPalindrome(readFile.next());

        readFile.close();
    }

    public static String reverseString (String word){
        String rStr = "";

        for (int i = word.length() - 1; 0 <= i; i--) {
            rStr += word.charAt(i);
        }

        return rStr;
    }

    public static void isPalindrome (String word) throws IOException{

        FileWriter wf = new FileWriter("output-7-3.txt");
        
        if(word.equals(reverseString(word))){
            wf.write("Yes, the string is palindrome");
        }else{
            wf.write("No, the string is not palindrome");
        }

        wf.close();

    }
}
