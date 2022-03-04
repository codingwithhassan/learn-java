import java.util.Scanner;
public class DiscountCouponLab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double discount;

        System.out.print("Please enter the cost of your groceries: ");
        double cost = in.nextDouble();

        if(cost >= 15 && cost <= 80){
            discount = 0.09 * cost;
            System.out.println("You win a discount coupon of $ "+discount+". (9% of your purchase)");
        }else if(cost > 80 && cost <= 160){
            discount = 0.11 * cost;
            System.out.println("You win a discount coupon of $ "+discount+". (11% of your purchase)");

        }else if(cost > 160 && cost <= 220){
            discount = 0.13 * cost;
            System.out.println("You win a discount coupon of $ "+discount+". (13% of your purchase)");

        }else if(cost > 220){
            discount = 0.15 * cost;
            System.out.println("You win a discount coupon of $ "+discount+". (15% of your purchase)");

        }else{
            System.out.print("No Coupon");
        }
    }
}
