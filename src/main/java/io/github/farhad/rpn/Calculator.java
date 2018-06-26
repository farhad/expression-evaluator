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
}
