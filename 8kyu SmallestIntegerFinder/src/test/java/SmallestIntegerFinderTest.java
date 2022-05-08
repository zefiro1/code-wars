import static org.junit.jupiter.api.Assertions.*;

class SmallestIntegerFinderTest {

    @org.junit.jupiter.api.Test
    void findSmallestInt() {
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(expected, actual);
    }
}