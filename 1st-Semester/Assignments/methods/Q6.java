public class Q6{
    public static int add(int n1, int n2){
        return n1 + n2;
    }
    public static int multiplication(int n1, int n2){
        return n1 * n2;
    }
    public static int subtraction(int n1, int n2){
        return n1 - n2;
    }
    public static int division(int n1, int n2){
        return n1 / n2;
    }
    public static void main(String args[]){
        int n1 = 2;
        int n2 = 54;
        char operation = '+';
        switch(operation){
            case '+':
                System.out.println("Addition : " + (add(n1,n2)));
                break;
            case '-':
                System.out.println("Subtraction : " + (subtraction(n1,n2)));
                break;
            case '*':
                System.out.println("Multiplication : " + (multiplication(n1,n2)));
                break;
            case '/':
                System.out.println("Division : " + (division(n1,n2)));
                break;
            default:
                System.out.println("Invalid Operation!");
        }
    }
}