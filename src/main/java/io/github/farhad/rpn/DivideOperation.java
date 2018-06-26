package io.github.farhad.rpn;

import java.math.BigDecimal;

public class DivideOperation implements Operation {
    @Override
    public void apply(OperandStack stack) {
        BigDecimal firstValue = stack.peek();
        stack.pop();
        BigDecimal secondValue = stack.peek();
        stack.replaceTop(secondValue.divide(firstValue,5, BigDecimal.ROUND_HALF_EVEN));
    }
}
