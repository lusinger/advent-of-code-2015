package dev.lukasdesantis.day.one;

public class DayOne {
    private DayOne() {}

    public static int retrieveTargetFloor(int initialFloor, String input) {
        if (input == null || input.isEmpty()) {
            return initialFloor;
        }

        int currentFloor = initialFloor;

        boolean visitedBasement = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                currentFloor++;
            } else if (input.charAt(i) == ')') {
                currentFloor--;
            }

            int position = positionOfFirstBasementVisit(visitedBasement, i, currentFloor);
            if (position != -1) {
                IO.println(position);
                visitedBasement = true;
            }
        }

        return currentFloor;
    }

    public static int positionOfFirstBasementVisit(boolean visitedBasement, int floorIndex, int currentFloor) {
        if (!visitedBasement && currentFloor == -1) {
            return floorIndex + 1;
        }

        return -1;
    }
}
