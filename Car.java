package backToTech;

public class Car {
    //attributes
    protected String model;
    protected String color;
    protected EngineType fuelType;
    protected int speed;
    protected int millage;



    //TODO add millage property

    //TODO add a fuel tank property


    // TODO See single responsibility principle
    //  https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#single-responsibility-principle

    //constructor
    //TODO car should receive engine as a parameter. There will be 3 type of engines: Diesel, Petrol and Electric. Use a common interface for all three (see the factory method pattern)
    //TODO car should receive the fuel tank as a parameter. There will be 2 types of fuel tanks: Fossil and Battery. Use a common interface for bought (see the factory method pattern)
    public Car(String model, String color, EngineType fuelType, int speed) {
        this.setModel(model);
        this.setColor(color);
        this.setFuelType(fuelType);
        this.setSpeed(speed);
    }

    //methods

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

    public EngineType getFuelType() {
        return fuelType;
    }

    public void setFuelType(EngineType fuelType) {
        this.fuelType = fuelType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //TODO add start method

    //TODO add stop method

    //TODO add accelerate method

    //TODO add break method

    //TODO implement the running and stopped states of the car. See https://www.geeksforgeeks.org/state-design-pattern/
    //  * TODO while the engine is running the car will move(increase millage) and consume fuel
    //  * TODO the car will stop if it has no more fuel
}
