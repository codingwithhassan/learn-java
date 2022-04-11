public class Q5{
    public static int GreatestCommonDivisor(int n1, int n2){
        while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }else{
                n2 = n2 - n1;
            }
        }
        return n1;
    }
    
    public static int factorial(int n){
        if(n == 1)
            return n;
        return n * factorial(n - 1);
    }

    public static String fibonacci(int n){
        String series = "0 1 ";
        int n1 = 0;
        int n2 = 1;
        int i = 0;
        while(i < n - 2){
            int n3 = n1 + n2;
            series += n3 + " ";
            n1 = n2;
            n2 = n3;
            i++;
        }
        return series;
    }

    public static int sum(int n){
        int sum = 0;
        int i = 0;
        while(i < n){
            sum += n;
            i++;
        }
        return sum;
    }

    public static boolean isPrime(int n){
        int i = 2;
        int sqrt = (int)Math.sqrt(n);
        while(i <= sqrt){
            if(n % i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main(String args[]){
        System.out.println(isPrime(7));
    }
}