package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge<result> {

        public double divide(double a, double b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        }

        /**
         * This main can throw an ArithmeticException!!!
         * @param args
         */
        public static void main(String[] args) {
            FirstChallenge firstChallenge = new FirstChallenge();
            try{
                double result = firstChallenge.divide(3, 0);
                System.out.println(result);
            }
            catch (ArithmeticException e){
                System.out.println("Exception caught: " + e);
            }
            finally {
                System.out.println("Program will be closed");
            }
        }

    }

