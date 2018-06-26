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
        new AddOperation().apply(stack);
    }

    public void subtract() {
        new SubtractOperation().apply(stack);
    }

    public void multiply() {
        new MultiplyOperation().apply(stack) ;
    }

    public void divide() {
        new DivideOperation().apply(stack);
    }
}
