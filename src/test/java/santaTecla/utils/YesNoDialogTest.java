package santaTecla.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

class YesNoDialogTest {

    @Mock
    Console console;

    @InjectMocks
    YesNoDialog yesNoDialog;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testRead() {
//        boolean result = yesNoDialog.read();
//        Assertions.assertTrue(result);
        fail();
    }
}
