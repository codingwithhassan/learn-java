import java.util.Scanner;

public class Q2 {
    public static int averageScore(int scores[]) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }

    public static int maximumScore(int scores[]) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (max < scores[i])
                max = scores[i];
        }
        return max;
    }

    public static int minimumScore(int scores[]) {
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (min > scores[i])
                min = scores[i];
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int scores[] = new int[20];

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Enter store of %d student: ", i + 1);
            scores[i] = in.nextInt();
        }

        // for(int i = 0; i < scores.length; i++){
        // System.out.printf("Store of %d student is : %d\n",i + 1,scores[i]);
        // }

        System.out.println("Average Score of class: " + averageScore(scores));
        System.out.println("Maximum Score of class: " + maximumScore(scores));
        System.out.println("Minimum Score of class: " + minimumScore(scores));
    }
}