package io.github.farhad.rpn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void setUp(){

    }

    @Test
    public void testNewCalculatorHasAnAccumulationOfZero(){

        Calculator calculator = new Calculator() ;

        Assert.assertEquals(calculator.getValue(),0l) ;
    }

    @After
    public void tearDown(){

    }
}
