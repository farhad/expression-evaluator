package io.github.farhad.rpn;

import java.math.BigDecimal;

public class SubtractOperation implements Operation {
    @Override
    public void apply(OperandStack stack) {

        BigDecimal firstValue = stack.peek();
        stack.pop();
        BigDecimal secondValue = stack.peek();
        stack.replaceTop(secondValue.subtract(firstValue));
    }
}
