import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOFibonacciLab3 {

    private static int getSize(File file) {
        int couter = 0;
        try {
            Scanner readFile = new Scanner(file);

            while (readFile.hasNext()) {
                readFile.next();
                couter++;
            }

            readFile.close();
        } catch (IOException e) {
            return 0;
        }

        return couter;
    }
    public static void main(String[] args) throws IOException{
        File file = new File("input-5-3.txt");
        Scanner readFile = new Scanner(file);
        
        FileWriter writeFile = new FileWriter("output-5-3.txt");

        int array[] = new int[getSize(file)];
        int couter = 0;

        while(readFile.hasNext()){
            array[couter++] = Integer.parseInt(readFile.next());
        }

        if(isFibonacci(array))
            writeFile.write("Yes, it is Fibonacci Series");
        else
            writeFile.write("Not, it is not Fibonacci Series");

        writeFile.close();
        readFile.close();

    }

    static boolean isFibonacci(int[] array){
        int pervious = 0;
        int next = 1;

        for (int i = 2; i < array.length; i++) {

            if(next + pervious != array[i]){
                return false;
            }

            pervious = next;
            next = array[i];
        }

        return true;
    }
}
