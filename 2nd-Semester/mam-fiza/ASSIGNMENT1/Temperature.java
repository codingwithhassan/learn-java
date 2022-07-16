import java.io.File;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) throws Exception {
        double temp[][] = new double[12][2];
        String months[] = new String[12];
        
        getData(months,temp);

        System.out.println("Average High Temperature: " + averageHigh(temp));
        System.out.println("Average Low Temperature: " + averageLow(temp));
        System.out.println("Highest Temperature of Year: " + temp[indexHighTemp(temp)][1]);
        System.out.println("Lowest Temperature of Year: " + temp[indexLowTemp(temp)][0]);
    }

    public static void getData(String[] months, double temp[][]) throws Exception {
        
        File file = new File("temperature.txt");
        Scanner readFile = new Scanner(file);

        int counter = 0;
        
        while (readFile.hasNext()) {
            String[] tokens = readFile.nextLine().split("\\s");
            
            months[counter] = tokens[0];
            
            temp[counter][0] = Double.parseDouble(tokens[1]);
            temp[counter][1] = Double.parseDouble(tokens[2]);

            counter++;
        }

        readFile.close();
    }

    public static double averageHigh(double temp[][]) {
        double avg = 0;
        for (int i = 0; i < temp.length; i++) {
            avg += temp[i][1];
        }

        return avg / temp.length;
    }

    public static double averageLow(double temp[][]) {
        double avg = 0;
        for (int i = 0; i < temp.length; i++) {
            avg += temp[i][0];
        }

        return avg / temp.length;
    }

    public static int indexHighTemp(double temp[][]) {
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[index][1] < temp[i][1]){
                index = i;
            }
        }
        return index;
    }

    public static int indexLowTemp(double temp[][]) {
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[index][0] > temp[i][0]){
                index = i;
            }
        }
        return index;
    }
}
