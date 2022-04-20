package Q6;
import java.util.Scanner;

public class Part1 {
    public static void bubbleSort(int[] a) {
        int i, j, temp;
        System.out.println("Arrays Elemets bofore Sorting");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Elemets of Array after Sorting");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[6];
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter the Arrys Elements:  ");
            a[i] = in.nextInt();

        }
        bubbleSort(a);
    }
}