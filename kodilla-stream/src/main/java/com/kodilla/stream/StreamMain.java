package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Decorating text...");
        poemBeautifier.beautify(" example text ", (a) -> "@" + a + "@");
        poemBeautifier.beautify(" example text ", (a) -> a.toUpperCase());
        poemBeautifier.beautify("example text ", (a) -> a + "in process");
        poemBeautifier.beautify("      example text       ", (a) -> a.trim());
    }
}