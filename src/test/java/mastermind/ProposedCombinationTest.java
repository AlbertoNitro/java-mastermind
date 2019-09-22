package mastermind;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import santaTecla.utils.Console;

import static org.junit.jupiter.api.Assertions.fail;

class ProposedCombinationTest {

    @Mock
    Console console;

    @InjectMocks
    ProposedCombination proposedCombination;

    @InjectMocks
    ProposedCombination proposedCombination2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.proposedCombination.colors = new Color[Combination.getWidth()];
        this.proposedCombination.colors[0] = Color.BLUE;
        this.proposedCombination.colors[1] = Color.RED;
        this.proposedCombination.colors[2] = Color.YELLOW;
        this.proposedCombination.colors[3] = Color.GREEN;

        this.proposedCombination2.colors = new Color[Combination.getWidth()];
        this.proposedCombination2.colors[0] = Color.BLUE;
        this.proposedCombination2.colors[1] = Color.BLUE;
        this.proposedCombination2.colors[2] = Color.ORANGE;
        this.proposedCombination2.colors[3] = Color.GREEN;
    }

    @Test
    void testWrite() {
//        this.proposedCombination.write();
        fail();
    }

    @Test
    void testRead() {
//        when(console.readString()).thenReturn("readStringResponse");
//        this.proposedCombination.read();
        fail();
    }

    @Test
    void testContainsColorAndPosition() {
        boolean result = this.proposedCombination.contains(Color.RED);
        Assertions.assertTrue(result);
        result = this.proposedCombination2.contains(Color.RED);
        Assertions.assertFalse(result);
    }

    @Test
    void testContainsColor() {
        boolean result = this.proposedCombination.contains(Color.RED, 0);
        Assertions.assertFalse(result);
        result = this.proposedCombination.contains(Color.RED, 1);
        Assertions.assertTrue(result);
        result = this.proposedCombination.contains(Color.RED, 2);
        Assertions.assertFalse(result);
        result = this.proposedCombination.contains(Color.RED, 3);
        Assertions.assertFalse(result);
    }

}
