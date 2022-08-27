public class Car {
    
    private String modelName;
    private String licenseNumber;
    private int yearOfPurchase;

    public Car() {
        this.modelName = null;
        this.licenseNumber = null;
        this.yearOfPurchase = 0;
    }

    public Car(String modelName, String licenseNumber) {
        this.modelName = modelName;
        this.licenseNumber = licenseNumber;
        this.yearOfPurchase = 0;
    }

    public Car(String modelName, String licenseNumber, int yearOfPurchase) {
        this.modelName = modelName;
        this.licenseNumber = licenseNumber;
        this.yearOfPurchase = yearOfPurchase;
    }

    public String getModelName() {
        return modelName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }

    public Car setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public Car setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }

    public Car setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
        return this;
    }

    public void copy(Car car) {
        this.setModelName(car.getModelName());
        this.setLicenseNumber(car.getLicenseNumber());
        this.setYearOfPurchase(car.getYearOfPurchase());
    }

    @Override
    public String toString() {
        return String.format(
            "\nModel Name: %s\nLicense Number: %s\nYear of Purchase: %d\n",
            this.getModelName(),
            this.getLicenseNumber(),
            this.getYearOfPurchase()
        );
    }
}
