public class HardDisk {
    private double price;
    private double capacity;
    private String type; // SSD or HDD

    public HardDisk(double price, String type, double capacity) {
        this.price = price;
        this.capacity = capacity;
        this.type = type;
    }// overloaded

    public HardDisk() {
        this.setPrice(12000);
        this.setCapacity(250);
        this.setType("SSD");
    }// default

    public HardDisk(HardDisk hd) {
        this.setCapacity(hd.getCapacity());
        this.setPrice(hd.getPrice());
        this.setType(hd.getType());
    }// copy

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public void state() {
        System.out.println("HD Price is: " + this.getPrice());
        System.out.println("HD Capacity is: " + this.getCapacity());
        System.out.println("HD Type is: " + this.getType());
    }

}