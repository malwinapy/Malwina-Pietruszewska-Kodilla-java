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
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        Integer [] example = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List <Integer> exampleList = Arrays.asList(example);
        Integer [] evenNumbers = new Integer [] {2,4,6,8,10};
        List <Integer> evenNumbersList = Arrays.asList(evenNumbers);

        //When
        List<Integer> expectedList = numbersExterminator.exterminate(evenNumbersList);
        List<Integer> resultList = numbersExterminator.exterminate(exampleList);
        //Then
        Assertions.assertEquals(resultList, expectedList);
    }

    @DisplayName("Testing empty list")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        Integer [] empty = new Integer[] {};
        List <Integer> emptyList = Arrays.asList(empty);
        Integer [] even = new Integer [] {2,4,6,8,10};
        List <Integer> evenNumbersList = Arrays.asList(even);

        //When
        List<Integer> expList = numbersExterminator.exterminate(evenNumbersList);
        List<Integer> resList = numbersExterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(resList, expList);
    }
}