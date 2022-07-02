import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOStringReplaceLab3 {
    public static void main(String[] args) {
        try {

            File file = new File("input-6-3.txt");
            Scanner readFile = new Scanner(file);

            FileWriter writeFile = new FileWriter("output-6-3.txt");

            while (readFile.hasNext()) {
                writeFile.write(replaceSpacesWithDots(readFile.nextLine()));
            }

            writeFile.close();
            readFile.close();

        } catch (IOException e) {
            System.out.println("Something went wrong!");
            System.out.println( e.getMessage() );
        }
    }

    public static String replaceSpacesWithDots(String sentence) {
        return sentence.replace(' ', '.');
    }
}
