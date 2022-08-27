public class Vehicle {
    
    private String vehicleType;
    private int numberOfWheels;
    private int seatingCapacity;
    private double speed;

    public Vehicle() {
        this.vehicleType = null;
        this.numberOfWheels = 0;
        this.seatingCapacity = 0;
        this.speed = 0.0;
    }

    public Vehicle(String vehicleType, int numberOfWheels, int seatingCapacity, double speed) {
        this.vehicleType = vehicleType;
        this.numberOfWheels = numberOfWheels;
        this.seatingCapacity = seatingCapacity;
        this.speed = speed;
    }

    public Vehicle(String vehicleType, double speed, int numberOfWheels, int seatingCapacity) {
        this.vehicleType = vehicleType;
        this.numberOfWheels = numberOfWheels;
        this.seatingCapacity = seatingCapacity;
        this.speed = speed;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public double getSpeed() {
        return speed;
    }

    public Vehicle setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public Vehicle setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    public Vehicle setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    public Vehicle setSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    public void deepCopy(Vehicle vehicle) {
        vehicle.setVehicleType(this.getVehicleType());
        vehicle.setNumberOfWheels(this.getNumberOfWheels());
        vehicle.setSeatingCapacity(this.getSeatingCapacity());
        vehicle.setSpeed(this.getSpeed());
    }

    /**
     * TODO: Not working well
     * @param vehicle
     */
    public void shallowCopy(Vehicle vehicle) {
        vehicle = this;
    }

    public Vehicle getCallerObject() {
        return this;
    }

    @Override
    public String toString() {
        return String.format(
            "\nVehicle Type: %s\nNumber of Wheels: %d\nSeating Capacity: %d\nSpeed : %.2f\n",
                this.getVehicleType(),
                this.getNumberOfWheels(),
                this.getSeatingCapacity(),
                this.getSpeed()
            );
    }
}
