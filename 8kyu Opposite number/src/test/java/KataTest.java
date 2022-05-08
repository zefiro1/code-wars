import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @org.junit.jupiter.api.Test
    void opposite() {
        assertEquals(-1, Kata.opposite(1));
        assertEquals(25, Kata.opposite(-25));
    }
}