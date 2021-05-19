package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
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

    @DisplayName("Testing Shape Collector...")

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("Circle", 12.7);
        //When
        collector.addFigure(circle);
        Shape expectedShape = collector.getFigure(0);
        //Then
        Assertions.assertEquals(expectedShape, circle);
    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square("Square", 16);
        collector.addFigure(square);
        //When
        collector.removeFigure(square);
        int a = collector.getSize();

        //Then
        Assertions.assertEquals(a,0);
    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", 18);
        collector.addFigure(triangle);
        //When
        Shape expectedFigure = collector.getFigure(0);
        //Then
        Assertions.assertEquals(expectedFigure, triangle);
    }
    @Test
    void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle1 = new Circle("circle", 13);
        Circle circle2 = new Circle("big circle", 35);
        Circle circle3 = new Circle("little circle", 2);
        collector.addFigure(circle1);
        collector.addFigure(circle2);
        collector.addFigure(circle3);
        //When
        List<Shape> expectedList = collector.showFigures();
        List<Shape> list = new ArrayList<>();
        list.add(circle1);
        list.add(circle2);
        list.add(circle3);
        //Then
        Assertions.assertEquals(expectedList, list);
    }
}
