package mastermind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import santaTecla.utils.Console;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

class SecretCombinationTest {

    @Mock
    ProposedCombination proposedCombination;

    @Mock
    Console console;

    @InjectMocks
    SecretCombination secretCombination;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.secretCombination.colors = new Color[Combination.getWidth()];
        this.secretCombination.colors[0] = Color.BLUE;
        this.secretCombination.colors[1] = Color.RED;
        this.secretCombination.colors[2] = Color.YELLOW;
        this.secretCombination.colors[3] = Color.GREEN;
    }

    @Test
    void testGetResult() {
        when(Combination.getWidth()).thenReturn(4);
        this.proposedCombination.colors = new Color[Combination.getWidth()];
        this.proposedCombination.colors[0] = Color.BLUE;
        this.proposedCombination.colors[1] = Color.RED;
        this.proposedCombination.colors[2] = Color.YELLOW;
        this.proposedCombination.colors[3] = Color.GREEN;
        Result result = secretCombination.getResult(this.proposedCombination);
        Result correctResult = new Result(4, 0);
        Assertions.assertEquals(correctResult.isWinner(), result.isWinner());
    }

    @Test
    void testWriteln() {
//        this.secretCombination.writeln();
        fail();
    }

}
