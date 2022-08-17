import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws Exception {
        File file = new File("intro.txt");
        Scanner read = new Scanner(file);
        while (read.hasNext()) {
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();
    }
}
