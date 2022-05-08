import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true};
    Boolean[] array2 = {null};

    @org.junit.jupiter.api.Test
    void countSheeps() {
        assertEquals( 17, new Counter().countSheeps(array1));
        new Counter().countSheeps(array2);

    }

}