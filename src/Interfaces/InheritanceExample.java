package Interfaces;

// Parent class (superclass)
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void drive() {
        System.out.println("The vehicle is being driven.");
    }
}

// Child class (subclass) inheriting from Vehicle
class Car extends Vehicle {
    int numberOfSeats;

    public Car(String brand, int year, int numberOfSeats) {
        super(brand, year); // Calling superclass constructor
        this.numberOfSeats = numberOfSeats;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Number of seats: " + numberOfSeats);
    }
}

// Another Child class (subclass) inheriting from Vehicle
class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String brand, int year, double loadCapacity) {
        super(brand, year); // Calling superclass constructor
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Load capacity (tons): " + loadCapacity);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 5);
        Truck truck = new Truck("Ford", 2019, 3.5);

        System.out.println("Car Information:");
        car.displayInfo();
        car.drive(); // Accessing method from superclass

        System.out.println();

        System.out.println("Truck Information:");
        truck.displayInfo();
        truck.drive(); // Accessing method from superclass
    }
}
