import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    private static final double DELTA = 1e-15;

    @org.junit.jupiter.api.Test
    public void testSomething() {
        assertEquals(1, Kata.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), DELTA);
    }
}