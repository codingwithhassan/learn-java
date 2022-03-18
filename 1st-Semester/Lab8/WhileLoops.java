import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int startingNum, endingNum;

        System.out.print("Enter starting number: ");
        startingNum = in.nextInt();
        System.out.print("Enter ending number: ");
        endingNum = in.nextInt();

        long sumEven = 0, sumOdd = 0;
        String evenOutput = "";

        if(startingNum < endingNum){
            System.out.println("Number : Square");
            int i = startingNum;
            while (i <= endingNum) {
                if(i % 2 == 0){
                    sumEven += i;
                    evenOutput += i + " ";
                }else{
                    sumOdd += i * i;
                }
                System.out.println(i + " : " + i * i);
                i++;
            }

            System.out.println("Even Numbers: ");
            System.out.println(evenOutput);
            System.out.println("Sum of Even Numbers: ");
            System.out.println(sumEven);
            System.out.println("Sum of the square of Odd Numbers: ");
            System.out.println(sumOdd);

        }else{
            System.out.println("Starting Number must be less than Ending Number!");
        }
    }
}
