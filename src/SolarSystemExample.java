// Abstract class representing a generic SpaceObject
abstract class SpaceObject {
    // Abstract method to calculate mass
    abstract double calculateMass();

    // Concrete method to display the type of space object
    void displayType() {
        System.out.println("This is a " + this.getClass().getSimpleName() + ".");
    }
}

// Subclass Planet extends SpaceObject
class Planet extends SpaceObject {
    private double radius;
    private double density;

    // Constructor
    Planet(double radius, double density) {
        this.radius = radius;
        this.density = density;
    }

    // Implementing the abstract method
    @Override
    double calculateMass() {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3) * density;
    }
}

// Subclass Star extends SpaceObject
class Star extends SpaceObject {
    private double luminosity;

    // Constructor
    Star(double luminosity) {
        this.luminosity = luminosity;
    }

    // Implementing the abstract method
    @Override
    double calculateMass() {
        // Simplified mass estimation based on luminosity
        return luminosity * 1.989e30; // Mass in kilograms (solar mass approximation)
    }
}

// Main class to demonstrate abstraction
public class SolarSystemExample {
    public static void main(String[] args) {
        // Create instances of space objects
        SpaceObject earth = new Planet(6371, 5514); // Earth radius in km, density in kg/m³
        SpaceObject jupiter = new Planet(69911, 1326); // Jupiter radius and density
        SpaceObject sun = new Star(1); // Sun's luminosity (solar units)

        // Display space object types and their calculated masses
        earth.displayType();
        System.out.println("Mass of Earth: " + earth.calculateMass() + " kg");

        jupiter.displayType();
        System.out.println("Mass of Jupiter: " + jupiter.calculateMass() + " kg");

        sun.displayType();
        System.out.println("Mass of the Sun: " + sun.calculateMass() + " kg");
    }
}
