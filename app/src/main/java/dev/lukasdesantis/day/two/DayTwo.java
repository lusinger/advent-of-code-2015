package dev.lukasdesantis.day.two;

import java.util.Arrays;

public class DayTwo {
    public static int calculateWrapperArea(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }

        String[] dimensions = input.toLowerCase().split("x");
        int length = Integer.parseInt(dimensions[0]);
        int width = Integer.parseInt(dimensions[1]);
        int height = Integer.parseInt(dimensions[2]);

        int firstSide = length * width;
        int secondSide = width * height;
        int thirdSide = height * length;
        int[] sides = new int[]{firstSide, secondSide, thirdSide};
        Arrays.sort(sides);

        return 2 * length * width + 2 * width * height + 2 * height * length + sides[0];
    }

    public static int calculateTieLength(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }

        String[] dimensions = input.toLowerCase().split("x");
        int length = Integer.parseInt(dimensions[0]);
        int width = Integer.parseInt(dimensions[1]);
        int height = Integer.parseInt(dimensions[2]);

        int[] sortedDimensions = new int[]{length, width, height};
        Arrays.sort(sortedDimensions);

        return 2 * sortedDimensions[0] + 2 * sortedDimensions[1] + length * width * height;
    }
}
