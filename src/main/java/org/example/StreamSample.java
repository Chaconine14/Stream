package org.example;

import java.util.Arrays;
import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        List<String> marinelifes = Arrays.asList("seaTurtle", "shark", "seahorse", "jellyfish", "tuna");
        List<String> result = marinelifes.stream()
                .filter(marinelife -> marinelife.contains("s")).sorted()
                .map(String::toUpperCase).toList();
        System.out.println(result);
    }
}