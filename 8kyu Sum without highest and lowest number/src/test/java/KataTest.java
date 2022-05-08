import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @org.junit.jupiter.api.Test
    public void BasicTests() {
        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
    }

}