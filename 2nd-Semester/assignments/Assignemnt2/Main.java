public class Main {
    public static void main(String[] args)
    {    
        Car car2 = new Car();
        car2.setModelName("Suzuki Wagnar")
            .setLicenseNumber("CSF8-343-783-343")
            .setYearOfPurchase(2013);
        System.out.print(car2);

        Car car0 = new Car("Nissan Wingroad", "CSF8-343-78-34", 2016);
        System.out.print(car0);
        
        Car car1 = new Car("Toyota Corolla", "CSF8-343-78-343");
        car1.setYearOfPurchase(2011);
        System.out.print(car1);

        System.out.println("Copy of " + car1.getModelName());
        Car car3 = new Car();
        car3.copy(car1);
        System.out.println("Before Change : ");
        System.out.print(car3);
        car3.setYearOfPurchase(2019);
        System.out.println("After Change : ");
        System.out.print(car3);

        Vehicle vehicle0 = new Vehicle("Car", 4, 4, 240.0);
        System.out.print(vehicle0);

        Vehicle vehicle1 = new Vehicle("Car", 300.0, 4, 4);
        System.out.print(vehicle1.getCallerObject());

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleType("Bike")
            .setNumberOfWheels(2)
            .setSeatingCapacity(2)
            .setSpeed(120.0);
        System.out.print(vehicle2);

        // shallow copy of vehicle0
        System.out.println("Shallow Copy of 1st vehicle");
        Vehicle copyOfVehicle0 = null;
        copyOfVehicle0 = vehicle0;
        // vehicle0.shallowCopy(copyOfVehicle0);
        System.out.print(copyOfVehicle0);
        System.out.println("After mutation in copy");
        System.out.print(copyOfVehicle0);

        // Deep copy of vehicle0
        Vehicle deepCopyOfVehicle0 = new Vehicle();
        vehicle0.deepCopy(deepCopyOfVehicle0);
        System.out.println("Before Change : ");
        System.out.print(deepCopyOfVehicle0);
        deepCopyOfVehicle0.setSpeed(250);
        System.out.println("After Change : ");
        System.out.print(deepCopyOfVehicle0);
        
        Engine engine0 = new Engine(2, 1);
        System.out.print(engine0);
        
        Engine engine1 = new Engine();
        engine1.setCapacity(4).setNumberOfCylinders(2);
        System.out.print(engine1);

        System.out.println("engine0 == engine1 : " + (engine0 == engine1) );
        System.out.println("engine0 == engine0 : " + (engine0 == engine0) );

        System.out.println("engine0.equals(engine1): " + engine0.equals(engine1));
        System.out.println("engine0.equals(engine0):" + engine0.equals(engine0));
    }
}
