/*
write -> new FileWriter('output_file.txt')
read -> File => new Scanner(new File("file.txt"))

throws Exception on method
*/
import java.io.FileWriter;

public class FileOutputLab3 {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("intro.txt");    // If file not exists it will create

        String text = "My name is hassan.\nI'am 21 years old\nCurrently studying at Gift University.";

        fw.write(text);

        fw.close();

    }
}