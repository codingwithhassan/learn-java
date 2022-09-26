public class Computer {
	private double price;
	private String make;
	private HardDisk HARDDISK;
	private Ram RAM;
	
	public Computer(double price, String make, HardDisk hARDDISK, Ram rAM) {\
		this.price = price;
		this.make = make;
		this.HARDDISK = new HardDisk(hARDDISK);
		this.RAM = new Ram(rAM);
	}//overloaded
	
	public Computer() {
		this.setPrice(200000);
		this.setMake("Razor");
		this.HARDDISK = new HardDisk();
		this.RAM = new Ram();
	}//default
	
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
	}//set&get
	
	
	public int getRamCapacity() {
		return (int) this.RAM.getCapacity();
	}
	
	public int getHardDiskCapacity() {
		return (int) this.HARDDISK.getCapacity();
	}
	
	public boolean isDiskSSD() {
		if(this.HARDDISK.getType() == "SSD")
			return false;
		else
			return true;
	}
	
	public boolean isRamCostly() {
		if(this.RAM.getPrice() > 3500)
			return true;
		else
			return false;
	}
	
	
	
	public void state() {
		System.out.println("Price is: "+this.getPrice());
		System.out.println("Make is: "+this.getMake());
		this.HARDDISK.state();
		this.RAM.state();
	}
	
	
	
}