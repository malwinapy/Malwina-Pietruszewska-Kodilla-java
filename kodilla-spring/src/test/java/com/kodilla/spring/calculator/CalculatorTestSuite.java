package com.kodilla.spring.calculator;

import com.kodilla.kodillaspring.KodillaSpringApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={KodillaSpringApplication.class})
public class CalculatorTestSuite {

    @Test
    void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(6, 2);
        double sub = calculator.sub(6, 2);
        double mul = calculator.mul(6, 2);
        double div = calculator.div(6, 2);

        //Then
        assertEquals(8, add);
        assertEquals(4, sub);
        assertEquals(12, mul);
        assertEquals(3, div);

    }

}