import java.util.Scanner;
public class LoopExampleLab7 {
public static void main(String[] args) {
Scanner read = new Scanner(System.in);
int num = 0;
int sum;
int count = 0;
System.out.print("Enter a value for sum: ");
sum = read.nextInt();
while (count < 3) {
System.out.print("Enter a value for num: ");
num = read.nextInt();
sum = sum + num;
count++;
}//while
System.out.print("Sum = " + sum);
}//main
}//class