public class Ram {

    private double price;
    private double capacity;
    
    public Ram() {
        this.price = 0.0;
        this.capacity = 0.0;
    }
    
    public Ram(Ram r) {
        this.price = r.getPrice();
        this.capacity = r.getCapacity();
    }
    
    public Ram(double price, double capacity) {
        this.price = price;
        this.capacity = capacity;
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

    public void state() {
        System.out.println("Ram [capacity=" + capacity + ", price=" + price + "]");
    }    
}
