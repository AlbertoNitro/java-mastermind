package mastermind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import santaTecla.utils.Console;

import static org.junit.jupiter.api.Assertions.fail;

class ColorTest {

    @Mock
    Console console;

    @InjectMocks
    Color color = Color.BLUE;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testAllInitials() {
        String initials = Color.allInitials();
        Assertions.assertEquals("rbygop", initials);
    }

    @Test
    void testGetInstanceInt() {
        Color result = Color.getInstance(0);
        Assertions.assertEquals(Color.RED, result);
        result = Color.getInstance(1);
        Assertions.assertEquals(Color.BLUE, result);
        result = Color.getInstance(2);
        Assertions.assertEquals(Color.YELLOW, result);
        result = Color.getInstance(3);
        Assertions.assertEquals(Color.GREEN, result);
        result = Color.getInstance(4);
        Assertions.assertEquals(Color.ORANGE, result);
        result = Color.getInstance(5);
        Assertions.assertEquals(Color.PURPLE, result);
    }

    @Test
    void testGetInstanceChar() {
        Color result = Color.getInstance('r');
        Assertions.assertEquals(Color.RED, result);
        result = Color.getInstance('b');
        Assertions.assertEquals(Color.BLUE, result);
        result = Color.getInstance('y');
        Assertions.assertEquals(Color.YELLOW, result);
        result = Color.getInstance('g');
        Assertions.assertEquals(Color.GREEN, result);
        result = Color.getInstance('o');
        Assertions.assertEquals(Color.ORANGE, result);
        result = Color.getInstance('p');
        Assertions.assertEquals(Color.PURPLE, result);
    }

    @Test
    void testLength() {
        int result = Color.length();
        Assertions.assertEquals(result, Color.values().length);
    }

    @Test
    void testWrite() {
        //this.color.write();
        fail();
    }

}
