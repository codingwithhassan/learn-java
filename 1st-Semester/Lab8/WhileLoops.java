import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int startingNum, endingNum;

        System.out.print("Enter starting number: ");
        startingNum = in.nextInt();
        System.out.print("Enter ending number: ");
        endingNum = in.nextInt();

        long sumEven = 0;
        String evenOutput = "", oddOutput = "";

        if(startingNum < endingNum){
            System.out.println("Number : Square");
            for (int i = startingNum; i <= endingNum; i++) {
                if(i % 2 == 0){
                    sumEven += i;
                    evenOutput += i + " ";
                }else{
                    oddOutput += i * i + " ";
                }
                System.out.println(i + " : " + i * i);
            }

            System.out.println("Even Numbers: ");
            System.out.println(evenOutput);
            System.out.println("Sum of Even Numbers: ");
            System.out.println(sumEven);
            System.out.println("Sum of the square of Odd Numbers: ");
            System.out.println(oddOutput);

        }else{
            System.out.println("Starting Number must be less than Ending Number!");
        }
    }
}
