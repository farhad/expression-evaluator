package io.github.farhad.rpn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class OperandStackTest {

    private OperandStack operandStack ;
    @Before
    public void setUp(){
        operandStack = new OperandStack();
    }

    @Test
    public void testNewOperandStackPeekReturnsZero(){
        Assert.assertEquals(operandStack.peek(),BigDecimal.ZERO);
    }

    @Test
    public void testPushToStack(){
        BigDecimal value = new BigDecimal(10);
        operandStack.push(value);
        Assert.assertEquals(operandStack.peek(),value);
    }

    @Test
    public void testReplaceTopOfStack(){
        operandStack.push(new BigDecimal(10));
        BigDecimal newValue = new BigDecimal(15) ;
        operandStack.replaceTop(newValue);
        Assert.assertEquals(newValue,operandStack.peek());
    }

    @Test
    public void testReplacingTopOfEmptyStack(){
        BigDecimal newValue = new BigDecimal(15) ;
        operandStack.replaceTop(newValue);
        Assert.assertEquals(newValue,operandStack.peek());
    }

    @Test
    public void testPoppingValuesFromStack(){
        BigDecimal newValue = new BigDecimal(15) ;
        operandStack.push(newValue);
        operandStack.push(new BigDecimal(10));
        operandStack.pop();
        Assert.assertEquals(newValue,operandStack.peek());
    }

    @Test
    public void testPoppingFromEmptyStackReturnZero(){
        operandStack.pop();
        Assert.assertEquals(operandStack.peek(),BigDecimal.ZERO);
    }

    @After
    public void tearDown(){

    }
}
