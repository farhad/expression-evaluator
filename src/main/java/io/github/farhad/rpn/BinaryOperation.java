package io.github.farhad.rpn;

import java.math.BigDecimal;

public abstract class BinaryOperation implements Operation {

    @Override
    public void apply(OperandStack stack) {

        BigDecimal secondOperand = stack.peek();
        stack.pop();
        BigDecimal firstOperand = stack.peek();
        stack.replaceTop(calculate(firstOperand,secondOperand));
    }

    protected abstract BigDecimal calculate(BigDecimal first, BigDecimal second);
}
