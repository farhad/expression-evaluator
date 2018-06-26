package io.github.farhad.rpn;

import java.math.BigDecimal;

public class AddOperation extends BinaryOperation {
    @Override
    protected BigDecimal calculate(BigDecimal first, BigDecimal second) {
        return first.add(second);
    }
}
