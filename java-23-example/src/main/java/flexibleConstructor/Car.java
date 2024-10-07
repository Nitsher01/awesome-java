package flexibleConstructor;

public class Car extends Vehicle {

    private final int seatingCapacity;
    private final String type;

    public Car(String registrationNumber, int seatingCapacity, String type) {
        if (registrationNumber == null) {
            throw new RuntimeException("Registration number cannot be null");
        }
        super(registrationNumber);
        this.seatingCapacity = seatingCapacity;
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int seatingCapacity() {
        return this.seatingCapacity;
    }

    @Override
    public boolean drive() {
        return true;
    }
}
