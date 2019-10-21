package mastermind;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import santaTecla.utils.Console;

class ResultTest {

    @Mock
    Console console;

    @InjectMocks
    Result result = new Result(2, 1);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testIsWinner() {
        Assertions.assertFalse(new Result(0, Combination.getWidth()).isWinner());
        Assertions.assertTrue(new Result(Combination.getWidth(), 0).isWinner());
    }

    @Test
    void testWriteln() {
//        this.winnerResult.writeln();
        fail();
    }

}
