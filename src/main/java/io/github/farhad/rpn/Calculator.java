package io.github.farhad.rpn;

import java.math.BigDecimal;
import java.util.Stack;

public class Calculator {

    private OperandStack stack = new OperandStack() ;

    public BigDecimal getAccumulator() {
       return stack.peek();
    }

    public void setAccumulator(BigDecimal value) {
        stack.replaceTop(value);
    }

    public void enter() {
        stack.push(getAccumulator());
    }

    public void drop(){
        stack.pop();
    }

    public void add() {
        BigDecimal firstValue = stack.peek();
        stack.pop();
        BigDecimal secondValue = stack.peek();
        stack.replaceTop(firstValue.add(secondValue));
    }

    public void subtract() {
        BigDecimal firstValue = stack.peek();
        stack.pop();
        BigDecimal secondValue = stack.peek();
        stack.replaceTop(secondValue.subtract(firstValue));
    }

    public void multiply() {
        BigDecimal firstValue = stack.peek();
        stack.pop();
        BigDecimal secondValue = stack.peek();
        stack.replaceTop(secondValue.multiply(firstValue));
    }

    public void divide() {
        BigDecimal firstValue = stack.peek();
        stack.pop();
        BigDecimal secondValue = stack.peek();
        stack.replaceTop(secondValue.divide(firstValue,5, BigDecimal.ROUND_HALF_EVEN));
    }
}
