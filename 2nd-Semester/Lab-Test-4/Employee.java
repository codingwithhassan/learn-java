public class Employee extends Person{
    private int empId;
    private int hoursPerWeek;
    private int payPerHour;

    public Employee() {
        this.empId = 0;
        this.hoursPerWeek = 0;
        this.payPerHour = 0;
    }

    public Employee(int empId, int hoursPerWeek, int payPerHour) {
        this.empId = empId;
        this.hoursPerWeek = hoursPerWeek;
        this.payPerHour = payPerHour;
    }
    public Employee(String name, String gender, double phoneNo, int empId, int hoursPerWeek, int payPerHour) {
        super(name, gender, phoneNo);
        this.empId = empId;
        this.hoursPerWeek = hoursPerWeek;
        this.payPerHour = payPerHour;
    }

    @Override
    public void isWorking() {
        if(empId == 0){
            System.out.println("user is not working!");
        }else{
            System.out.println("Yes, user is working!");
        }
    }
    @Override
    public void pay() {
        System.out.println("Pay of "+ this.getName() +": " + hoursPerWeek * payPerHour);
    }
    @Override
    public void display() {
        System.out.println("[gender=" + this.getGender() + ", name=" + this.getName() + ", phoneNo=" + this.getPhoneNo() + ",empId=" + empId + ", hoursPerWeek=" + hoursPerWeek + ", payPerHour=" + payPerHour + "]");
    }
}