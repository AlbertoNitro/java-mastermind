package mastermind;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import santaTecla.utils.Console;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

class MastermindTest {

    @Mock
    SecretCombination secretCombination;

    @Mock
    Console console;

    @InjectMocks
    Mastermind mastermind;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMain() {
        when(secretCombination.getResult(any())).thenReturn(new Result(0, 0));
        Mastermind.main(new String[]{"args"});
    }

}
