import static org.junit.jupiter.api.Assertions.*;

class BioTest {
    @org.junit.jupiter.api.Test
    public void testDna() throws Exception {
        Bio b = new Bio();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }
    @org.junit.jupiter.api.Test
    public void testDna2() throws Exception {
        Bio b = new Bio();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}