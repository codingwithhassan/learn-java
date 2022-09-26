public abstract class Person{
    private String name;
    private String gender;
    private double phoneNo;
    
    public Person() {
        this.name = "No Name";
        this.gender = null;
        this.phoneNo = 0.0;
    }
    
    public Person(String name, String gender, double phoneNo) {
        this.name = name;
        this.gender = gender;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void changePhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }

    public abstract void isWorking();
    public abstract void pay();
    public abstract void display();
}