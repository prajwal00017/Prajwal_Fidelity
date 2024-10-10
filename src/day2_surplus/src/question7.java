class Electronics {
    String brand;
    String model;
    double price;

    public Electronics(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

class Laptop extends Electronics {
    String ram;
    String processor;

    public Laptop(String brand, String model, double price, String ram, String processor) {
        super(brand, model, price);
        this.ram = ram;
        this.processor = processor;
    }

    public void showLaptopDetails() {
        showDetails();
        System.out.println("RAM: " + ram);
        System.out.println("Processor: " + processor);
    }
}

class Smartphone extends Electronics {
    String camera;
    String battery;

    public Smartphone(String brand, String model, double price, String camera, String battery) {
        super(brand, model, price);
        this.camera = camera;
        this.battery = battery;
    }
    public void showSmartphoneDetails() {
        showDetails();
        System.out.println("Camera: " + camera + " MP");
        System.out.println("Battery: " + battery + " mAh");
    }
}

public class question7 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 1200.0, "16GB", "Intel i7");
        System.out.println("Laptop Details:");
        laptop1.showLaptopDetails();

        Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S21", 999.0, "108", "4000");
        System.out.println("\nSmartphone Details:");
        smartphone1.showSmartphoneDetails();
    }
}
