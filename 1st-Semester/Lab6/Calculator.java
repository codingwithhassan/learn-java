import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Press + for addition\nPress - for subtraction\nPress * for multiplication\nPress / for division\nPress % for remainder\nPress S or s for square root\nPress P or p for power\n:");
        char choice = in.next().charAt(0);

        if(choice == '+'){
            System.out.print("Enter first Number: ");
            double n1 = in.nextDouble();
            System.out.print("Enter second Number: ");
            double n2 = in.nextDouble();
            System.out.println("Sum of "+n1+" and "+n2+" is "+ (n1+n2));
        }else if(choice == '-'){
            System.out.print("Enter first Number: ");
            double n1 = in.nextDouble();
            System.out.print("Enter second Number: ");
            double n2 = in.nextDouble();
            System.out.println("Subtraction of "+n1+" and "+n2+" is "+ (n1-n2));    
        }else if(choice == '*'){
            System.out.print("Enter first Number: ");
            double n1 = in.nextDouble();
            System.out.print("Enter second Number: ");
            double n2 = in.nextDouble();
            System.out.println("Multiplication of "+n1+" and "+n2+" is "+ (n1*n2));
        }else if(choice == '/'){
            System.out.print("Enter first Number: ");
            double n1 = in.nextDouble();
            System.out.print("Enter second Number: ");
            double n2 = in.nextDouble();
            System.out.println("Division of "+n1+" and "+n2+" is "+ (n1/n2));
        }else if(choice == '%'){
            System.out.print("Enter first Number: ");
            double n1 = in.nextDouble();
            System.out.print("Enter second Number: ");
            double n2 = in.nextDouble();
            if(n2 == 0){
                System.out.println("Division By Zero not allowed!");
            }else{
                System.out.println("Modulus of "+n1+" and "+n2+" is "+ (n1%n2));
            }
        }else if(choice == 's' || choice == 'S'){
            System.out.print("Enter a Number: ");
            double n = in.nextDouble();
            System.out.println("Square Root of "+n+" is "+ Math.sqrt(n));
        }else if(choice == 'p' || choice == 'P'){
            System.out.print("Enter a Number: ");
            double n = in.nextDouble();
            System.out.print("Enter power of number "+n+": ");
            double pw = in.nextDouble();
            System.out.println(pw+ "'s power of "+n+" is "+ Math.pow(n,pw));
        }else{
            System.out.println("Invalid Choice!");
        }
    }
}