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
        List <Integer> exampleList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List <Integer> expectedList = Arrays.asList(2,4,6,8,10);
        //When
        List<Integer> resultList = numbersExterminator.exterminate(exampleList);
        //Then
        Assertions.assertEquals(resultList, expectedList);
    }
    @DisplayName("Testing empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        List <Integer> emptyList = Collections.emptyList();
        List <Integer> expectedList = Arrays.asList();

        //When
        List<Integer> resList = numbersExterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(resList, expectedList);
    }
}