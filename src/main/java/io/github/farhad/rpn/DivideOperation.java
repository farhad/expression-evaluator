package io.github.farhad.rpn;

import java.math.BigDecimal;

public class DivideOperation extends BinaryOperation{
    @Override
    protected BigDecimal calculate(BigDecimal first, BigDecimal second) {
        return first.divide(second,5, BigDecimal.ROUND_HALF_EVEN) ;
    }
}
