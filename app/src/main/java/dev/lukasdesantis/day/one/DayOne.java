package dev.lukasdesantis.day.one;

public class DayOne {
    private DayOne() {}

    public static int retrieveTargetFloor(int initialFloor, String input) {
        if (input == null || input.isEmpty()) {
            return initialFloor;
        }

        for (char character : input.toCharArray()) {
            if (character == '(') {
                initialFloor++;
            } else if (character == ')') {
                initialFloor--;
            }
        }

        return initialFloor;
    }
}
