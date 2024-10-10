class Vehicle {
    protected String registrationNumber;
    protected String brand;

    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public double calculateParkingFee() {
        return 0.0;
    }

    public void displayVehicleDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateParkingFee() {
        return 20.0;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}
class Motorcycle extends Vehicle {
    private String engineType;

    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double calculateParkingFee() {
        return 10.0;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Type: " + engineType);
    }
}

public class question4 {
    public static void main(String[] args) {
        Car car = new Car("473468", "General Motors", 4);
        System.out.println("Car Details:");
        car.displayVehicleDetails();
        System.out.println("Parking Fee for Car: $" + car.calculateParkingFee());

        System.out.println("----------------------------");

        Motorcycle motorcycle = new Motorcycle("NGK987643", "Ninja Kawasaki ZR", "Dual V6");
        System.out.println("Motorcycle Details:");
        motorcycle.displayVehicleDetails();
        System.out.println("Parking Fee for Motorcycle: $" + motorcycle.calculateParkingFee());
    }
}

