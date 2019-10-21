package mastermind;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import santaTecla.utils.Console;

class ProposedCombinationTest {

    @Mock
    Console console;

    @InjectMocks
    ProposedCombination proposedCombination;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
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
        assertTrue(new ProposedCombinationBuilder().characters("rybo").build().contains(Color.RED));
        assertFalse(new ProposedCombinationBuilder().characters("rybo").build().contains(Color.PURPLE));
    }

    @Test
    void testContainsColor() {
        assertTrue(new ProposedCombinationBuilder().characters("oygr").build().contains(Color.RED,3));
        assertTrue(new ProposedCombinationBuilder().characters("pybo").build().contains(Color.PURPLE,0));
        assertFalse(new ProposedCombinationBuilder().characters("rybo").build().contains(Color.PURPLE,0));
    }

}
