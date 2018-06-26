package io.github.farhad.rpn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

public class OperationTest {

    private Calculator calculator ;

    @Before
    public void setUp(){
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(5));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(15));
    }

    @Test
    public void testAdd(){
        calculator.add();
        Assert.assertEquals(BigDecimal.valueOf(20),calculator.getAccumulator());
    }

    @Test
    public void testSubtract(){
        calculator.subtract();
        Assert.assertEquals(BigDecimal.valueOf(-10),calculator.getAccumulator());
    }

    @Test
    public void testMultiply(){
        calculator.multiply();
        Assert.assertEquals(BigDecimal.valueOf(75),calculator.getAccumulator());
    }

    @Test
    public void testDivide(){
        calculator.divide();
        BigDecimal expected = BigDecimal.valueOf(0.33333d).setScale(5,BigDecimal.ROUND_HALF_EVEN) ;
        Assert.assertEquals(expected,calculator.getAccumulator());
    }

    @After
    public void tearDown(){
    }
}
