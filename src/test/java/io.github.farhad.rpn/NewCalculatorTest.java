package io.github.farhad.rpn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class NewCalculatorTest {

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

    @Test
    public void testEnteringAndDroppingValues(){

        BigDecimal valueOne = new BigDecimal(10) ;
        BigDecimal valueTwo = new BigDecimal(20) ;
        BigDecimal valueThree = new BigDecimal(30) ;

        calculator.setAccumulator(valueOne);
        calculator.enter() ;
        calculator.setAccumulator(valueTwo);
        calculator.enter() ;
        calculator.setAccumulator(valueThree);
        assertEquals(valueThree,calculator.getAccumulator());
        calculator.drop();
        assertEquals(valueTwo,calculator.getAccumulator());
        calculator.drop() ;
        assertEquals(valueOne,calculator.getAccumulator());
    }

    @After
    public void tearDown(){

    }
}
