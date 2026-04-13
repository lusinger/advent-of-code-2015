package dev.lukasdesantis.day.two;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTwoTest {
    @Test
    void test_calculationOfWrapperArea_byInput() {
        String input = "2x3x4";

        int actualWrapperAre = DayTwo.calculateWrapperArea(input);
        assertEquals(58, actualWrapperAre);
    }
}
