package DataStructures;

public class WorkwithSingalton {
    public static void main(String[] args) {
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        // Check if both instances are the same
        System.out.println("singletonInstance1 == singletonInstance2: " + (singletonInstance1 == singletonInstance2));
    }
}

class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
    }

    // Public static method to get the single instance of the class
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only if it's not already created
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the singleton class can be added here
}
