import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String demo="demo";
    @Test
    void testTakeCharsWithOrder(){
        assertEquals("demo",Main.takeCharsWithOrder(demo,0));
        demo="test";
        assertEquals("t",Main.takeCharsWithOrder(demo,0));
    }
    @Test
    void testTakeCharsWithOrderMaxLength(){
        assertEquals("demo",Main.takeCharsWithOrderMaxLength(demo));
        demo="Welcome";
        assertEquals("Welo",Main.takeCharsWithOrderMaxLength(demo));
    }
}