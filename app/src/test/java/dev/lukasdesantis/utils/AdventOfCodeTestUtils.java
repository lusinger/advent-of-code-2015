package dev.lukasdesantis.utils;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AdventOfCodeTestUtils {
    public static BufferedReader readResourceAsStream(String fileName) {
        InputStream inputStream = AdventOfCodeTestUtils.class.getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IllegalArgumentException("File not found: " + fileName);
        }

        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
