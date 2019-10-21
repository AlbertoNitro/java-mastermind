package mastermind;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import santaTecla.utils.Console;

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
        assertEquals("rbygop", Color.allInitials());
    }

    @Test
    void testGetInstanceInt() {
        for(int i=0; i<Color.length(); i++){
            assertEquals(Color.values()[i], Color.getInstance(i));
        }
    }

    @Test
    void testGetInstanceChar() {
        String characters = "rbygop";
        for(int i=0; i<characters.length(); i++){
             assertEquals(Color.values()[i], Color.getInstance(characters.charAt(i)));
        }
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
