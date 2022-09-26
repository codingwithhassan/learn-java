public class Ram {
	private double price;
	private double capacity;	
	
	public Ram(double price, double capacity) {
		this.price = price;
		this.capacity = capacity;
	}//overloaded
	
	public Ram() {
		this.setCapacity(4);
		this.setPrice(4000);
	}//default
	
	public Ram(Ram r) {
		this.setCapacity(r.getCapacity());
		this.setPrice(r.getPrice());
	}	//copy
	
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
		System.out.println("RAM capacity is: "+this.getCapacity());
		System.out.println("RAM Price is: "+this.getPrice());
	}
	
}