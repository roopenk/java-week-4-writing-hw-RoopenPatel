package program_23_method_overriding;

public class Bike extends Vehicle {
    // Defining the same method as parent class
    public void run() {
        System.out.println("Bike Is Running Safely");
    }

    public static void main(String[] args) {
        Bike obj = new Bike(); // Object creation
        obj.run(); //  Calling method
    }
}
