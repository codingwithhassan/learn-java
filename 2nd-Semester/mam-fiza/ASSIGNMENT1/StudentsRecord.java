import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * StudentsRecord
 */
public class StudentsRecord {
    public static void main(String[] args) throws IOException{
        String[] names = new String[10];
        double[] scores = new double[10];
        String[] grades = new String[10];

        readAndStore(names, scores, grades);
        result(names, scores, grades);
    }

    public static void readAndStore(String[] names, double[] scores, String[] grades) throws IOException{

        File file = new File("students.txt");
        Scanner readFile = new Scanner(file);

        int counter = 0;
        
        while (readFile.hasNext()) {
            String[] tokens = readFile.nextLine().split("\\s");
            
            names[counter] = tokens[0];

            double avg = getAverage(removeFirstElement(tokens));

            scores[counter] = avg;

            grades[counter] = getGrade(avg);

            counter++;
        }

        readFile.close();

    }

    public static double getAverage(String[] arr) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += Integer.parseInt(arr[i]);
        }
        return avg / arr.length;
    }

    public static void showClassAverage(double[] scores) {
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            avg += scores[i];
        }
        avg /= scores.length;

        System.out.println("Class Average: " + avg);
    }

    public static String[] removeFirstElement(String[] arr) {
        String newArr[] = new String[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }

    private static String getGrade(double marks){
        if(marks >= 85 && marks <= 100){
            return "A+";
        }else if(marks >= 80 && marks < 85){
            return "A-";
        }else if(marks >= 75 && marks < 80){
            return "B+";
        }else if(marks >= 70 && marks < 75){
            return "B";
        }else if(marks >= 65 && marks < 70){
            return "B-";
        }else if(marks >= 61 && marks < 65){
            return "C+";
        }else if(marks >= 58 && marks < 61){
            return "C";
        }else if(marks >= 55 && marks < 58){
            return "C-";
        }else if(marks >= 50 && marks < 55){
            return "D";
        }else{
            return "F";
        }
    }

    public static void result(String[] names, double[] scores, String[] grades){
        System.out.println("Name     Average  Grage");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%7s  %.2f     %s\n",names[i], scores[i], grades[i]);
        }

        showClassAverage(scores);
    }
}