
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class code22
{


    public static void main(String[] args) {
        Car c = new Car("Toyota", 120, "Petrol");
        c.display();
    }
}
