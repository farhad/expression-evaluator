package io.github.farhad.rpn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator ;
    @Before
    public void setUp(){

        calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorHasAnAccumulationOfZero(){

        assertEquals(calculator.getAccumulator(),BigDecimal.ZERO) ;
    }

    @Test
    public void testSetAccumulatorValueWorks(){

        calculator.setAccumulator(BigDecimal.valueOf(23));
        assertEquals(calculator.getAccumulator(),BigDecimal.valueOf(23)) ;
    }

    @After
    public void tearDown(){

    }
}
