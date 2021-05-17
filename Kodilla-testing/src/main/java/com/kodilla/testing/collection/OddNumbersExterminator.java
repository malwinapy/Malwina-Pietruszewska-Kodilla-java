package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : evenNumbers){
            if (number%2==0){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}

