public class Q15 {
    public static void main(String[] args) {
        int i, j, spaces, s;
        s=10;
        i = 1;
        while(i<=10){
            spaces=1;
            while(spaces <= s){
                System.out.print("   ");
                spaces++;
            }
            j=1;
            while(j <= (2*i) -1){
			    System.out.print( j + "   " );	
                j = j+i;
            }	
		    System.out.print(" \n ");
		    s--;
            i++;
        }
    }
}
