package dev.lukasdesantis.day.one;


import dev.lukasdesantis.utils.AdventOfCodeTestUtils;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOneTest {
    @Test
    void testRetrievalOfCorrectFloor_byInput() {
        int targetFloor;
        try (BufferedReader input = AdventOfCodeTestUtils.readResourceAsStream("inputs/day-one.txt")) {
            int initialFloor = 0;

            targetFloor = DayOne.retrieveTargetFloor(initialFloor, input.readLine());
            assertEquals(138, targetFloor);
        } catch (IOException e) {
            IO.println(e.getMessage());
        }
    }

    @Test
    void test_returnOfPositionOfFirstBasementVisit() {
        boolean visitedBasement = false;
        int floorIndex = 10;
        int currentFloor = -1;

        int positionFirstVisit = DayOne.positionOfFirstBasementVisit(visitedBasement, floorIndex, currentFloor);
        assertEquals(11, positionFirstVisit);
    }

    @Test
    void test_returnNegativeOne_ifBasementNotVisited() {
        boolean visitedBasement = true;
        int floorIndex = 10;
        int currentFloor = -1;

        int positionFirstVisit = DayOne.positionOfFirstBasementVisit(visitedBasement, floorIndex, currentFloor);
        assertEquals(-1, positionFirstVisit);
    }

    @Test
    void test_returnNegativeOne_ifNotFirstBasementFloor() {
        boolean visitedBasement = false;
        int floorIndex = 10;
        int currentFloor = -3;

        int positionFirstVisit = DayOne.positionOfFirstBasementVisit(visitedBasement, floorIndex, currentFloor);
        assertEquals(-1, positionFirstVisit);
    }
}
