import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIOSumNumbersLab3 {
    public static void main(String[] args) throws Exception {
        File file = new File("input-2-3.txt");
        Scanner readFile = new Scanner(file);

        int sum = 0;

        while (readFile.hasNext()) {
            sum += Integer.parseInt(readFile.next());
        }

        readFile.close();

        System.out.println("Sum: " + sum);

        FileWriter fWriter = new FileWriter("output-2-3.txt");
        fWriter.write(Integer.toString(sum));
        fWriter.close();
    }
}
