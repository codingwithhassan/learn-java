import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1, num2, num;
        char choice, choiceStart = 'y';
        String correctUserName = "hassan";
        String correctPassword = "211370007";

        System.out.print("Enter Username: ");
        String userName = in.next();
        System.out.print("Enter Password: ");
        String password = in.next();
        if (userName.equals(correctUserName) && password.equals(correctPassword)) {
            while (choiceStart == 'y' || choiceStart == 'Y') {
                System.out.println();
                System.out.print("Press Y for start or N for exit : ");
                choiceStart = in.next().charAt(0);
    
                if (choiceStart == 'y' || choiceStart == 'Y') {
    
                    System.out.println("Welcome to Calculator!\n");
    
                    System.out.println("Press + for Addition");
                    System.out.println("Press - for Subtraction");
                    System.out.println("Press * for Multiplication");
                    System.out.println("Press / for Division");
                    System.out.println("Press S for Scientific Calculator");
                    System.out.println("Press G for Geometric Functions");
                    System.out.println("Press E for Exit");
                    choice = in.next().charAt(0);
    
                    if (choice == '+') {
                        System.out.print("Enter First Number: ");
                        num1 = in.nextDouble();
                        System.out.print("Enter Second Number: ");
                        num2 = in.nextDouble();
    
                        System.out.println("Sum is :" + (num1 + num2));
                    }else if (choice == '-') {
                        System.out.print("Enter First Number: ");
                        num1 = in.nextDouble();
                        System.out.print("Enter Second Number: ");
                        num2 = in.nextDouble();
    
                        System.out.println("Sum is :" + (num1 - num2));
                    }else if (choice == '*') {
                        System.out.print("Enter First Number: ");
                        num1 = in.nextDouble();
                        System.out.print("Enter Second Number: ");
                        num2 = in.nextDouble();
    
                        System.out.println("Sum is :" + (num1 * num2));
                    }else if (choice == '/') {
                        System.out.print("Enter First Number: ");
                        num1 = in.nextDouble();
                        System.out.print("Enter Second Number: ");
                        num2 = in.nextDouble();
    
                        System.out.println("Sum is :" + (num1 / num2));
                    }else if (choice == 'S' || choice == 's') {
                        System.out.println("Press L for Log Function");
                        System.out.println("Press S for Sin Function");
                        System.out.println("Press C for Cos Function");
                        System.out.println("Press T for Tan Function");
                        System.out.println("Press P for Power Function");
                        System.out.println("Press M for Main Menu");
                        System.out.println("Press E for Exit");
                        choice = in.next().charAt(0);
    
                        if (choice == 'l' || choice == 'L') {
                            System.out.print("Enter a Number: ");
                            num = in.nextDouble();
    
                            System.out.println("Log of number is " + Math.log(num));
                        }else if (choice == 's' || choice == 'S') {
                            System.out.print("Enter a Number: ");
                            num = in.nextDouble();
    
                            System.out.println("Sin of number is " + Math.sin(num));
                        }else if (choice == 'c' || choice == 'C') {
                            System.out.print("Enter a Number: ");
                            num = in.nextDouble();
    
                            System.out.println("Cos of number is " + Math.cos(num));
                        }else if (choice == 't' || choice == 'T') {
                            System.out.print("Enter a Number: ");
                            num = in.nextDouble();
    
                            System.out.println("Tan of number is " + Math.tan(num));
                        }else if (choice == 'p' || choice == 'P') {
                            System.out.print("Enter a Number: ");
                            num1 = in.nextDouble();
                            System.out.print("Enter Power: ");
                            num2 = in.nextDouble();
    
                            System.out.println("Cos of number is " + Math.pow(num1, num2));
                        }else if (choice == 'm' || choice == 'M')
                            continue;
                        else{
                            System.out.print("Good Bye!");
                            choiceStart = 'n';
                        }
                    }else if (choice == 'G' || choice == 'g') {
                        System.out.println("Press 1 for Rectangle");
                        System.out.println("Press 2 for Square");
                        System.out.println("Press 3 for Triangle");
                        System.out.println("Press M for Main Menu");
                        System.out.println("Press E for Exit");
                        choice = in.next().charAt(0);
    
                        if (choice == '1') {
                            System.out.println("Press A for Area");
                            System.out.println("Press P for Perimeter");
                            choice = in.next().charAt(0);
    
                            if (choice == 'a' || choice == 'A') {
                                System.out.print("Enter Length: ");
                                num1 = in.nextDouble();
                                System.out.print("Enter Width: ");
                                num2 = in.nextDouble();

                                System.out.println("Area of Rectangle: " + (num1 * num2));
                            }
                            if (choice == 'p' || choice == 'P') {
                                System.out.print("Enter Length: ");
                                num1 = in.nextDouble();
                                System.out.print("Enter Width: ");
                                num2 = in.nextDouble();

                                System.out.println("Perimeter of Rectangle: " + (2.0 * (num1 + num2)));
                            }
                        }else if (choice == '2') {
                            System.out.println("Press A for Area");
                            System.out.println("Press P for Parameter");
                            choice = in.next().charAt(0);
    
                            if (choice == 'a' || choice == 'A') {
                                System.out.print("Enter Length of side: ");
                                num = in.nextDouble();

                                System.out.println("Area of Square: " + (Math.pow(num,2)));
                            }
                            if (choice == 'p' || choice == 'P') {
                                System.out.print("Enter Length of side: ");
                                num = in.nextDouble();

                                System.out.println("Perimeter of Square: " + (4.0 * num));
                            }
                        }else if (choice == '3') {
                            System.out.println("Press A for Area");
                            System.out.println("Press P for Parameter");
                            choice = in.next().charAt(0);

                            if (choice == 'a' || choice == 'A') {
                                System.out.print("Enter Base: ");
                                num1 = in.nextDouble();
                                System.out.print("Enter Height: ");
                                num2 = in.nextDouble();

                                System.out.println("Area of Triangle: " + ( (num1 * num2) / 2.0) );
                            }
                            if (choice == 'p' || choice == 'P') {
                                System.out.print("Enter first side  : ");
                                num = in.nextDouble();
                                System.out.print("Enter second side : ");
                                num1 = in.nextDouble();
                                System.out.print("Enter third side  : ");
                                num2 = in.nextDouble();

                                System.out.println("Perimeter of Triangle: " + (num + num1 + num2));
                            }
                        }else if (choice == 'm' || choice == 'M')
                            continue;
                        else{
                            System.out.print("Good Bye!");
                            choiceStart = 'n';
                        }
                    }else{
                        System.out.print("Good Bye!");
                        choiceStart = 'n';
                    }
                } else if (choiceStart == 'n' || choiceStart == 'N'){
                    System.out.print("Good Bye!");
                    choiceStart = 'n';
                }
                else
                    System.out.print("Invalid Choice");
            }
        } else
            System.out.println("Invalid Credentials.");
    }
}
