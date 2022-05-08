import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {
    @org.junit.jupiter.api.Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));
    }
}