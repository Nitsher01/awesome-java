package flexibleConstructor;

public class FlexibleConstructorExample {
    public static void main(String[] args) {
        Vehicle jeep = new Car("ABSCEDF", 5, "Jeep");
        assert true == jeep.drive();
    }
}
