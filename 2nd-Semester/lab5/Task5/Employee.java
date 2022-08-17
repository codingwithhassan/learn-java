public class Employee {
    private String name;
    private long idNumber;
    private String department;
    private String position; // job title

    public void setName(String name){
        this.name = name;
    }

    public void setIdNumber(long idNumber){
        this.idNumber = idNumber;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setPositiion(String title){
        position = title;
    }

    public String get(){
        return String.format("\nName: %s\nId Number: %d\nDepartment: %s\nPosition: %s\n", 
            this.name,
            this.idNumber,
            this.department,
            this.position
        );
    }
}
