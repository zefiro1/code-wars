import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveCharsTest {



    @org.junit.jupiter.api.Test
    void remove() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));

    }
}