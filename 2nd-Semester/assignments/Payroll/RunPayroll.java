public class RunPayroll {
    public static void main(String[] args) {
        Payroll pay = new Payroll();
        pay.setName("Ali");

        pay.display();

        Payroll pay2 = new Payroll(
            "hassan",
            1,
            25.5,
            9
        );

        System.out.print(pay2);

        Payroll pay3 = new Payroll(pay);
        pay3.setIdNumber(3);
        pay3.setHourlyPayRate(19);
        pay3.setNumberOfHoursWorked(40);

        pay3.display();

        System.out.println("Gross Pay of pay3 is: " + pay3.grossPay());

        System.out.println("Compare pay2 and pay3 is: " + pay2.compare(pay3));
        System.out.println("pay3 is not equal to pay2 : " + pay2.isNotEqual(pay3));

        Payroll combinePay2Pay3 = pay2.create(pay3);
        combinePay2Pay3.display();
        
        Payroll copyOfPay2 = new Payroll();
        pay2.copy(copyOfPay2);
        System.out.print(copyOfPay2);
        
    }
}