package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calc = new Calculator(10,7);

        int sumResult = calc.sumAAndB();

        if (sumResult==17) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        double subResult = calc.subtractAFromB();
        if (subResult==-3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}