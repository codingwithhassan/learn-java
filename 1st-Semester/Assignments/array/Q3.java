import java.util.Scanner;

public class Q3 {
    public static double averageTemperature(double[] temperature) {
        double sum = 0;
        for (int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
        }
        return sum / temperature.length;
    }

    public static int maximumTemperature(double[] temperature) {
        double max = temperature[0];
        int index = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (max < temperature[i]) {
                index = i;
                max = temperature[i];
            }
        }
        return index;
    }

    public static int mimimumTemperatue(double[] temperature) {
        double min = temperature[0];
        int index = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (min > temperature[i]) {
                index = i;
                min = temperature[i];
            }
        }
        return index;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        double temperature[] = { 17.8, 20.7, 26.5, 35.2, 40, 43.4, 46.2, 46.3, 44.0, 33, 26.1, 17.3 };

        System.out.println("Average temperature of year: " + averageTemperature(temperature));
        System.out.println("Maximum temperature month: " + (maximumTemperature(temperature) + 1));
        System.out.println("Minimum temperature month: " + (mimimumTemperatue(temperature) + 1));
    }
}