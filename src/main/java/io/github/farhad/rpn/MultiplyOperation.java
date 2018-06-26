package io.github.farhad.rpn;

import java.math.BigDecimal;

public class MultiplyOperation extends BinaryOperation{

    @Override
    protected BigDecimal calculate(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }
}
