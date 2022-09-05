public class Car {
    
    // composition
    private final Engine ENGINE;
    private final FuelTank TANK;

    private String make;
    private int model;
    private double price;

    public Car() {
        ENGINE = new Engine();
        TANK = new FuelTank();
        this.make = null;
        this.model = 0;
        this.price = 0.0;
    }

    public Car(Engine eNGINE, FuelTank tANK, String make, int model, double price) {
        ENGINE = new Engine(eNGINE);
        TANK = new FuelTank(tANK);
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public Engine getENGINE() {
        return ENGINE;
    }

    public FuelTank getTANK() {
        return TANK;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxFuelCapacity(){
        return TANK.getMaxFuelCapacity();
    }

    public int getTopSpeed(){
        return ENGINE.getTopSpeed();
    }

    public double reFuel(){
        TANK.setLitresFuel(TANK.getMaxFuelCapacity());
        return TANK.getLitresFuel();
    }

    public boolean startCar(){
        if(!this.ENGINE.isEngineRunning()){
            this.ENGINE.startEngine();
            this.TANK.removeFuel(10.0);
        }
        return false;
    }

    public boolean stopCar(){
        if(this.ENGINE.isEngineRunning()){
            this.ENGINE.stopEngine();
        }
        return false;
    }

    public void currentCarState(){
        System.out.println();
        System.out.println("Car [ make=" + make + ", model=" + model + ", price=" + price + "]");
        ENGINE.currentEngineState();
        TANK.currentFuelLevel();
        System.out.println();
    }
}
