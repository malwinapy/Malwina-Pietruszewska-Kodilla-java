package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.*;
import java.util.*;
import java.lang.*;

public class CollectionTestSuite<expectedList, evenNumbersList> {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Testing List of random numbers ")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        Integer [] exampleList = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List <Integer> example = Arrays.asList(exampleList);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(example);
        Integer evenNumbers [] = new Integer [] {2,4,6,8,10};
        List<Integer> evenNumbersList = (ArrayList<Integer>) Arrays.asList(evenNumbers);

        //When
        ArrayList<Integer> expectedList = oddNumbersExterminator.exterminate(example);
        //Then
        Assertions.assertEquals(evenNumbersList, expectedList);
    }
}




