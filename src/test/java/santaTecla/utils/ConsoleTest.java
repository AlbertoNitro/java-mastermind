package santaTecla.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.ArgumentMatchers.anyString;

class ConsoleTest {

    @Mock
    BufferedReader bufferedReader;

    @InjectMocks
    Console console = new Console();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testReadStringString() throws IOException {
        String textToMock = "Hello!";
        Mockito.when(bufferedReader.readLine()).thenReturn(textToMock);
        String result = console.readString("");
        Assertions.assertEquals(textToMock, result);
    }

    @Test
    void testReadString() {
        String textToMock = "Hello!";
        Mockito.when(console.readString(anyString())).thenReturn(textToMock);
        String result = console.readString();
        Assertions.assertEquals(textToMock, result);
    }

    @Test
    void testReadInt() {
        int intToMock = 1;
        Mockito.when(console.readString(anyString())).thenReturn("1");
        int result = console.readInt("");
        Assertions.assertEquals(intToMock, result);
    }

    @Test
    void testReadChar() {
        String textToMock = "a";
        Mockito.when(console.readString(anyString())).thenReturn(textToMock);
        char result = console.readChar("");
        Assertions.assertEquals(textToMock.charAt(0), result);
    }

    @Test
    void testWriteln() {
        console.writeln();
    }

    @Test
    void testWriteString() {
        console.write("string");
    }

    @Test
    void testWritelnString() {
        console.writeln("string");
    }

    @Test
    void testWriteChar() {
        console.write('a');
    }
}
