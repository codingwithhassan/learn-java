public class SalesTax{
    public static void main(String[] args){
        double netIncome = 100, // purchase amount
            stateSalesTaxPercent = 0.04, countrySalesTaxPercent = 0.02;
        double grossIncome, // before tax
            stateTax, countryTax, totalTax, totalSales;

        stateTax = stateSalesTaxPercent * netIncome;
        countryTax = countrySalesTaxPercent * netIncome;
        totalTax = stateTax + countryTax;
        totalSales = totalTax + netIncome;

        System.out.println("Amount of Purchase: " + netIncome);
        System.out.println("Sate Sales Tax: " + stateTax);
        System.out.println("Country Sales tax: " + countryTax);
        System.out.println("Total Sales tax: " + totalTax);
        System.out.println("Total Sales: " + totalSales);

    }
}