import static org.junit.jupiter.api.Assertions.*;

class GrassHopperTest {

    @org.junit.jupiter.api.Test
    public void test1() {
        assertEquals(1, GrassHopper.summation(1));
    }
    @org.junit.jupiter.api.Test
    public void test2() {
        assertEquals(36, GrassHopper.summation(8));
    }
}