public class Main {
    public static void main(String[] args) {

        Contractual contractEmployee = new Contractual(1,"Haider","2022-02-01","2022-10-01");
        Loan loan = new Loan(3,400,"2021-02-01","2022-02-01");

        // add tasks
        contractEmployee.addTask("Contracts Module with digital signatures");
        contractEmployee.addTask("Admin can send email to contractor for digital Signature",false);

        // set Loan
        contractEmployee.addLoan(loan);

        // add Salary
        Salary salary = new Salary(700);
        contractEmployee.setSalary(salary);

        System.out.println(contractEmployee);

        System.out.println("================================================================================================");

        FullTime fullTimeEmployee = new FullTime(1,"Haider",3);
        Loan loan2 = new Loan(3324,400,"2021-02-01","2022-02-01");
        Loan loan4 = new Loan(34324,43400,"2022-02-01","2023-02-01");

        // add Loans
        fullTimeEmployee.addLoan(loan2);
        fullTimeEmployee.addLoan(loan4);

        // add Salary
        fullTimeEmployee.setSalary(salary);

        // add tasks
        fullTimeEmployee.addTask("Integrate Digital Pen with web and test it");
        fullTimeEmployee.addTask("Complete Contract Module Testing",false);
        fullTimeEmployee.addTask("Feature Test Cases");

        // remove task
        fullTimeEmployee.removeTask("Feature Test Cases");
        
        System.out.println(fullTimeEmployee);

    }
}
