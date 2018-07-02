package io.github.farhad.rpn;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InfixEvaluationTest {

    private InfixEvaluator infixEvaluator ;

    @Before
    public void setUp(){
        infixEvaluator = new InfixEvaluator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInfixEvaluatorNotAcceptingInvalidCharacter(){

        infixEvaluator.evaluate("7<9") ;
    }

    @Test
    public void testEvaluationNotAcceptingParanthesis(){

    }

    @After
    public void tearDown(){

    }
}
