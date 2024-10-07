package flexibleConstructor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlexibleConstructorTest {

    @Test
    public void flexibleConstructor_executesSuccessfully() {
        Vehicle jeep = new Car("ABSCEDF", 5, "Jeep");
        assertTrue(jeep.drive());
    }

    @Test
    public void flexibleConstructor_thorwsException() {
        assertThrows(RuntimeException.class, () -> new Car(null, 5, "Jeep"));
    }

}
