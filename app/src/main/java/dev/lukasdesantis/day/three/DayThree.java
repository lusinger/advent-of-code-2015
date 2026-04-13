package dev.lukasdesantis.day.three;

import java.util.HashMap;
import java.util.Map;

public class DayThree {
    public static Map<String, Integer> getLocationsDelivered(String startingPos, String input) {
        Map<String, Integer> locationsDelivered = new HashMap<>();

        if (input == null || input.isEmpty()) {
            return locationsDelivered;
        }

        String[] coordinates = startingPos.split("-");
        int currentXPos = Integer.parseInt(coordinates[0]);
        int currentYPos = Integer.parseInt(coordinates[1]);

        locationsDelivered.put(startingPos, 1);

        for (char direction : input.toCharArray()) {
            switch (direction) {
                case '<':
                    currentXPos--;
                    break;
                case '>':
                    currentXPos++;
                    break;
                case '^':
                    currentYPos++;
                    break;
                case 'v':
                    currentYPos--;
                    break;
            }

            persistDeliveredLocations(locationsDelivered, currentXPos, currentYPos);
        }

        return locationsDelivered;
    }

    private static void persistDeliveredLocations(Map<String, Integer> locationsDelivered, int currentXPos, int currentYPos) {
        locationsDelivered.putIfAbsent(currentXPos + "-" + currentYPos, 1);
    }
}
