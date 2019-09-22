package mastermind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import santaTecla.utils.Console;

import static org.junit.jupiter.api.Assertions.fail;

class ResultTest {
    @Mock
    Console console;

    @InjectMocks
    Result winnerResult = new Result(Combination.getWidth(), 0);

    @InjectMocks
    Result looserResult = new Result(0, Combination.getWidth());

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testIsWinner() {
        Assertions.assertFalse(looserResult.isWinner());
        Assertions.assertTrue(winnerResult.isWinner());
    }

    @Test
    void testWriteln() {
//        this.winnerResult.writeln();
        fail();
    }

}
