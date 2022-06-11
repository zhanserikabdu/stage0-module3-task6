package lang.print.gaps.task6;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloatTypeCastingTest extends BaseIOTest {

    @Test
    void roundNumberShouldRoundToFloorNumber() {
        FloatTypeCasting toTest = new FloatTypeCasting();

        toTest.roundNumber(19.4F);

        assertEquals("19\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void roundNumberShouldRoundToTopNumber() {
        FloatTypeCasting toTest = new FloatTypeCasting();

        toTest.roundNumber(19.5F);

        assertEquals("20\n", updateLineSpliterators(outContent.toString()));
    }
}