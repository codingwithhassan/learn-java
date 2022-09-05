public class Computer {
    
    /*
     *  There are two types of association
     *  1- aggregation
     *  2- composition 
     */
    // composition (type of association)
    private final HardDisk HARDDISK;
    private final Ram RAM;

    private double price;
    private String make;

    public Computer() {
        HARDDISK = new HardDisk();
        RAM = new Ram();
        this.price = 0.0;
        this.make = "Unknown";
    }

    public Computer(HardDisk hARDDISK, Ram rAM, double price, String make) {
        HARDDISK = new HardDisk(hARDDISK);
        RAM = new Ram(rAM);
        this.price = price;
        this.make = make;
    }

    public HardDisk getHARDDISK() {
        return HARDDISK;
    }

    public Ram getRAM() {
        return RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getRamCapacity(){
        return (int)RAM.getCapacity();
    }

    public int getHardDiskCapacity(){
        return (int)HARDDISK.getCapacity();
    }

    public boolean isRamCostly(){
        return RAM.getPrice() > 4000;
    }

    public boolean isDiskSSD(){
        return HARDDISK.getType().toLowerCase().equals("ssd");
    }

    public void computerState() {
        System.out.println("Computer [make=" + make + ", price=" + price + "]");
        HARDDISK.state();
        RAM.state();
    }
}
