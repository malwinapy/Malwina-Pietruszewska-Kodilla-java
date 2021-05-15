package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> numbers;
    public OddNumbersExterminator(List<Integer> numbers){
        this.numbers= numbers;
    }

    public ArrayList<Integer> exterminate(List<Integer> example){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i=0; i<numbers.size(); i++){
            int num=numbers.get(i);
            if (num%2==0){
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}

