package dev.lukasdesantis.day.two;

import dev.lukasdesantis.utils.AdventOfCodeTestUtils;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTwoTest {
    @Test
    void test_calculationOfWrapperArea_byInput() {
        try (BufferedReader bufferedReader = AdventOfCodeTestUtils.readResourceAsStream("inputs/day-two.txt")) {
            int totalWrapperArea = bufferedReader.lines().mapToInt(DayTwo::calculateWrapperArea).sum();
            assertEquals(1588178, totalWrapperArea);
        } catch (IOException e) {
            IO.println(e.getMessage());
        }
    }

    @Test
    void test_calculationOfTieLength_byInput() {
        try (BufferedReader bufferedReader = AdventOfCodeTestUtils.readResourceAsStream("inputs/day-two.txt")) {
            int totalTieLength = bufferedReader.lines().mapToInt(DayTwo::calculateTieLength).sum();
            assertEquals(3783758, totalTieLength);
        } catch (IOException e) {
            IO.println(e.getMessage());
        }
    }
}
