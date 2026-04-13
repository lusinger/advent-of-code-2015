package dev.lukasdesantis.day.one;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOneTest {
    @Test
    void testRetrievalOfCorrectFloor_byInput() {
        String input = ")())())";
        int initialFloor = 0;

        int targetFloor = DayOne.retrieveTargetFloor(initialFloor, input);
        assertEquals(-3, targetFloor);
    }
}
