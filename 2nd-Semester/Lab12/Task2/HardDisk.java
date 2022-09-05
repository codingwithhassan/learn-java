public class HardDisk {
    
    private double price;
    private double capacity;
    private String type;
    
    public HardDisk() {
        this.price = 0.0;
        this.capacity = 0.0;
        this.type = "NONE";
    }
    
    public HardDisk(HardDisk hd) {
        this.price = hd.getPrice();
        this.capacity = hd.getCapacity();
        this.type = hd.getType();
    }
    
    public HardDisk(double price, double capacity, String type) {
        this.price = price;
        this.capacity = capacity;
        this.type = type;
    }

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
        System.out.println("HardDisk [capacity=" + capacity + ", price=" + price + ", type=" + type + "]");
    }
}
