public class Student {
    private int id;
    private String name;
    private String program;
    private double cgpa;
    private String phoneNumber;
    
    public Student() {
        this.id = 0;
        this.name = "unknown";
        this.program = "none";
        this.cgpa = 0.0;
        this.phoneNumber = "000000000";
    }
    
    public Student(int id, String name, String program, double cgpa, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.program = program;
        this.cgpa = cgpa;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", program=" + program + ", cgpa=" + cgpa + ", phoneNumber="
                + phoneNumber + "]";
    }
}
