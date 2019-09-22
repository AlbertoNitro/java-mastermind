package mastermind;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import santaTecla.utils.Console;

import static org.junit.jupiter.api.Assertions.fail;

class MessageTest {

    @Mock
    Console console;

    @InjectMocks
    Message message;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testWrite() {
//        this.message.write();
        fail();
    }

    @Test
    void testWriteln() {
//        this.message.writeln();
        fail();
    }

    @Test
    void testWritelnInt() {
//        this.message.writeln(0);
        fail();
    }

    @Test
    void testWritelnIntInt() {
//        this.message.writeln(0, 0);
        fail();
    }

}
