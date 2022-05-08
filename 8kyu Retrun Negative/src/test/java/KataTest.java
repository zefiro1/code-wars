import org.junit.jupiter.api.Assertions;

class KataTest {

    @org.junit.jupiter.api.Test
    void makeNegative() {

        Assertions.assertEquals(-42, Kata.makeNegative(42));
        Assertions.assertEquals(-557, Kata.makeNegative(-557));


    }
}