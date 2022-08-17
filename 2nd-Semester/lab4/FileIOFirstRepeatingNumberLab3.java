import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIOFirstRepeatingNumberLab3 {
    public static void main(String[] args) throws Exception{
        File file = new File("input-3-3.txt");
        Scanner readFile = new Scanner(file);

        FileWriter fw = new FileWriter("output-3-3.txt");

        int[] numbers = new int[Integer.parseInt(readFile.next())];
        int c = 0;
        while (readFile.hasNext()) {
            numbers[c++] = Integer.parseInt(readFile.next());
        }

        int num = getFirstRepeatingNumber(numbers);

        if(num != -1)
            fw.write(Integer.toString(num));
        else
            fw.write("All elements are unique");

        fw.close();
    }

    static int getFirstRepeatingNumber(int[] array){
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if(key == array[j])
                    return array[i];
            }
        }
        return -1;
    }
}
