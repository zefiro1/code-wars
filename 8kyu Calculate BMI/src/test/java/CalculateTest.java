import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    @org.junit.jupiter.api.Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}