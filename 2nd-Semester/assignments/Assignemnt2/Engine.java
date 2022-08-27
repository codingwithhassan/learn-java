public class Engine {

    private float capacity;
    private int numberOfCylinders;

    public Engine() {
        this.capacity = 0.0f;
        this.numberOfCylinders = 0;
    }

    public Engine(float capacity, int numberOfCylinders) {
        this.capacity = capacity;
        this.numberOfCylinders = numberOfCylinders;
    }

    public float getCapacity() {
        return capacity;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public Engine setCapacity(float capacity) {
        this.capacity = capacity;
        return this;
    }
    
    public Engine setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        
        // same object
        if (this == obj)
            return true;

        // instance not created of argument variable
        if (obj == null)
            return false;

        // not same class
        if (getClass() != obj.getClass())
            return false;

        Engine engine = (Engine) obj;
        if (
            numberOfCylinders != engine.numberOfCylinders ||
            capacity != engine.capacity
        )
            return false;

        return true;
    }

    @Override
    public String toString() {
        return String.format(
            "\nCapacity: %.2f \nNumber Of Cylinders: %d\n",
            this.getCapacity(),
            this.getNumberOfCylinders()
        );
    }    
}
