import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @org.junit.jupiter.api.Test
    public void testSomething() {
        assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
        assertEquals("nice so not is world The",ReverseWords.reverseWords("The world is not so nice"));
    }
}