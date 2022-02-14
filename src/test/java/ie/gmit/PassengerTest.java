package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    @Test
    public void testPassengerWithValidInputs() {
        new Passenger("Mr", "John Doe", "0123456789", "0871234567", 30);
    }

    @Test
    public void testPassengerWithInvalidTitle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Passenger("A", "John Doe", "0123456789", "0871234567", 30); });
        assertEquals("Title must be 'Mr', 'Mrs', or 'Ms'", exception.getMessage());
    }

    @Test
    public void testPassengerWithInvalidName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Mr", "Ab", "0123456789", "0871234567", 30); });
        assertEquals("Name must have a minimum of three characters", exception.getMessage());
    }

    @Test
    public void testPassengerWithInvalidId() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Mr", "John Doe", "012345678", "0871234567", 30); });
        assertEquals("ID must have a minimum of ten characters", exception.getMessage());
    }

    @Test
    public void testPassengerWithInvalidPhone() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Mr", "John Doe", "0123456789", "087123", 30); });
        assertEquals("Phone must have a minimum of seven characters", exception.getMessage());
    }

    @Test
    public void testPassengerWithInvalidAge() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Mr", "John Doe", "0123456789", "0871234567", 16); });
        assertEquals("Age must be over 16", exception.getMessage());
    }
}
