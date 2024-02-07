package DataStructures;

public class WorkwithFacade {
    public static void main(String[] args) {
        // Create a computer facade
        ComputerFacade computerFacade = new ComputerFacade();

        // Start the computer using the facade
        computerFacade.startComputer();
    }
}
// Subsystem 1: CPU
class CPU {
    public void processData() {
        System.out.println("Processing data...");
    }
}

// Subsystem 2: Memory
class Memory {
    public void loadMemory() {
        System.out.println("Loading memory...");
    }
}

// Subsystem 3: HardDrive
class HardDrive {
    public void readData() {
        System.out.println("Reading data from hard drive...");
    }
}

// Facade class providing a simplified interface to the subsystems
class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    // Method to start the computer
    public void startComputer() {
        cpu.processData();
        memory.loadMemory();
        hardDrive.readData();
        System.out.println("Computer started successfully.");
    }
}