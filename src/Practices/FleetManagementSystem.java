package Practices;

class Vehicle {
    private final double fuelEfficiency;

    public Vehicle(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double calculateFuelConsumption(double distance) {
        return distance / fuelEfficiency;
    }
}

class Car extends Vehicle {
    public Car(double fuelEfficiency) {
        super(fuelEfficiency);
    }
}

class Truck extends Vehicle {
    private final double load;

    public Truck(double fuelEfficiency, double load) {
        super(fuelEfficiency);
        this.load = load;
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return super.calculateFuelConsumption(distance) + (load * 0.1);
    }
}

class Bus extends Vehicle {
    public Bus(double fuelEfficiency) {
        super(fuelEfficiency);
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return super.calculateFuelConsumption(distance) + 2;
    }
}

public class FleetManagementSystem {
    public static double calculateTotalFuelConsumption(Vehicle[] vehicles, double distance) {
        double totalFuelConsumption = 0;
        for (Vehicle vehicle : vehicles) {
            totalFuelConsumption += vehicle.calculateFuelConsumption(distance);
        }
        return totalFuelConsumption;
    }

    public static void main(String[] args) {
        Car car1 = new Car(20);
        Truck truck1 = new Truck(10, 500);
        Bus bus1 = new Bus(5);

        Vehicle[] vehicles = {car1, truck1, bus1};
        double totalDistance = 1000;

        truck1.calculateFuelConsumption(1000);
        System.out.println("Fuel consumption for the truck: " + truck1.calculateFuelConsumption(1000));

        double totalFuelConsumption = calculateTotalFuelConsumption(vehicles, totalDistance);
        System.out.println("Total fuel consumption for the fleet: " + totalFuelConsumption);
    }
}
