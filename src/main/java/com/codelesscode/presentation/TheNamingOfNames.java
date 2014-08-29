package com.codelesscode.presentation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TheNamingOfNames {

    private List<String> names = Arrays.asList("Dave", "Trisha");
    
    // Do NOT do this
    int x;
    int x1;
    int x2;
    int x3;
    int x4;
    int x5;
    int x6;
    int x7;
    int x8;
    int x9;
    int x10;

    public int performTaxCalculation() {
        // Hmm was it x2 or x3 we needed to divide by?
        return x1 / x2 * 100;
    }

    public void lambdaNaming() {
        Stream<String> nameStream = names.stream();
        // n is not a good name
        List<String> tNames = nameStream.filter(n -> n.startsWith("T")).
                                                     collect(Collectors.toList());
    }

    public void exceptionNaming() {
        try {
            Files.delete(Paths.get("Nonsense Path"));
        }
        // e is not a good name
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
