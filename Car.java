package backToTech;

public class Car {
    //attributes
    private String model;
    private String color;
    private String fuelType; //TODO this should be an enum https://www.w3schools.com/java/java_enums.asp
    private int speed;

    //TODO add millage property

    //TODO add a fuel tank property

    private int stock; //TODO the car should not know about the available stock. This is the job of the shop.
    // TODO See single responsibility principle
    //  https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#single-responsibility-principle

    //constructor
    //TODO car should receive engine as a parameter. There will be 3 type of engines: Diesel, Petrol and Electric. Use a common interface for all three (see the factory method pattern)
    //TODO car should receive the fuel tank as a parameter. There will be 2 types of fuel tanks: Fossil and Battery. Use a common interface for bought (see the factory method pattern)
    public Car(String model, String color, String fuelType, int speed) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.speed = speed;
    }

    //methods
    public int countCarStock () {
        return stock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    //TODO add start method

    //TODO add stop method

    //TODO add accelerate method

    //TODO add break method

    //TODO implement the running and stopped states of the car. See https://www.geeksforgeeks.org/state-design-pattern/
    //  * TODO while the engine is running the car will move(increase millage) and consume fuel
    //  * TODO the car will stop if it has no more fuel
}
