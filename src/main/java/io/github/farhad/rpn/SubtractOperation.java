package io.github.farhad.rpn;

import java.math.BigDecimal;

public class SubtractOperation extends BinaryOperation{
    @Override
    protected BigDecimal calculate(BigDecimal first, BigDecimal second) {
        return first.subtract(second);
    }
}
