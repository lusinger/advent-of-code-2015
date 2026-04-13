package dev.lukasdesantis.day.three;

import org.junit.jupiter.api.Test;
import java.util.Map;

import static  org.junit.jupiter.api.Assertions.*;

class DayThreeTest {
    @Test
    void test_amountOfLocationsRecieved_atleastOnePresent() {
        String input = "<>^";
        String startingPos = "0-0";
        Map<String, Integer> locationsDelivered = DayThree.getLocationsDelivered(input);

        assertEquals(3, locationsDelivered.size());
    }
}
