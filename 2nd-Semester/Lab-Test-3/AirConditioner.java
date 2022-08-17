public class AirConditioner {

    private String name;
    private double capacity;
    private String type;

    public AirConditioner() {
        this.name = null;
        this.capacity = 0.0;
        this.type = "wall";
    }

    public AirConditioner(String name, double capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(
            "Name: %s\nCapacity: %.2f\nType: %s",
            this.getName(),
            this.getCapacity(),
            this.getType().toUpperCase()
        );

    }

}
