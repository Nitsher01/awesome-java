package flexibleConstructor;

public abstract class Vehicle {

    private String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public abstract String getType();

    public abstract int seatingCapacity();

    public abstract boolean drive();

}
