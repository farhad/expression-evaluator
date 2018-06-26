package io.github.farhad.rpn;

import org.junit.Assert ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculatorWithMultipleValuesTest {

    private Calculator calculator ;
    private BigDecimal valueOne;
    private BigDecimal valueTwo;
    private BigDecimal valueThree ;

    @Before
    public void setUp(){

        calculator = new Calculator();
        valueOne = new BigDecimal(10);
        valueTwo = new BigDecimal(20) ;
        valueThree = new BigDecimal(30) ;

        calculator.setAccumulator(valueOne);
        calculator.enter();
        calculator.setAccumulator(valueTwo);
        calculator.enter();
        calculator.setAccumulator(valueThree);
    }

    @Test
    public void testAccumulatorAfterPushingThreeValues(){
        assertEquals(calculator.getAccumulator(),valueThree);
    }

    @Test
    public void testAccumulatorAfterSingleDrop(){
        calculator.drop();

        assertEquals(calculator.getAccumulator(),valueTwo);
    }

    @Test
    public void testAccumulatorAfterDroppingTwice(){

        calculator.drop();
        calculator.drop();

        assertEquals(calculator.getAccumulator(),valueOne);
    }

    @Test
    public void testAccumulatorAfterDroppingAllValues(){
        calculator.drop();
        calculator.drop();
        calculator.drop();

        assertEquals(calculator.getAccumulator(),BigDecimal.ZERO);
    }

    @After
    public void tearDown(){

    }


}
