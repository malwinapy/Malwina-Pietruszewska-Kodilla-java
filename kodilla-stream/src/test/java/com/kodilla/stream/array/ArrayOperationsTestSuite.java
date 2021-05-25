package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int [] numbers = generateArray(20);

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(9.5, result);

    }
    public int[] generateArray(int n){
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = i;
        }
        return numbers;
    }
}
