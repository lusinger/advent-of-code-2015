package dev.lukasdesantis.day.three;

import dev.lukasdesantis.day.one.DayOne;
import dev.lukasdesantis.utils.AdventOfCodeTestUtils;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

import static  org.junit.jupiter.api.Assertions.*;

class DayThreeTest {
    @Test
    void test_amountOfLocationsRecieved_atleastOnePresent() {
        try (BufferedReader input = AdventOfCodeTestUtils.readResourceAsStream("inputs/day-three.txt")) {
            String startingPos = "0-0";
            Map<String, Integer> locationsDelivered = DayThree.getLocationsDelivered(startingPos, input.readLine());

            assertEquals(2565, locationsDelivered.size());
        } catch (IOException e) {
            IO.println(e.getMessage());
        }
    }
}
