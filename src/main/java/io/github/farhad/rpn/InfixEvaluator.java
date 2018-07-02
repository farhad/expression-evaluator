package io.github.farhad.rpn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfixEvaluator implements Evaluation {

    public InfixEvaluator(){
    }

    @Override
    public boolean evaluate(String expression) {
        if(hasInvalidCharacter(expression))
            throw new IllegalArgumentException("expression has invalid characters") ;
        return true ;
    }

    private boolean hasInvalidCharacter(String expression){
        return true ;
    }
}
