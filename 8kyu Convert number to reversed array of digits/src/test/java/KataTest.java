import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @org.junit.jupiter.api.Test
    void digitize() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata.digitize(35231));
        assertArrayEquals(new int[] {0}, Kata.digitize(0));

    }
}