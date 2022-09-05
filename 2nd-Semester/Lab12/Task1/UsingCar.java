public class UsingCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.currentCarState();

        car.startCar();
        System.out.println("-------------------------");
        car.currentCarState();
    }    
}
