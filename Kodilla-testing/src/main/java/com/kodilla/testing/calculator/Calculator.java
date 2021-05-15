package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sumAAndB() {
        int sum = a + b;
        return sum;
    }

    public double subtractAFromB() {
        double subtract = b - a;
        return subtract;
    }
}
