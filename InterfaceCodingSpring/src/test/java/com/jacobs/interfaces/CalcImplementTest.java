package com.jacobs.interfaces;

import junit.framework.TestCase;
/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;*/

public class CalcImplementTest extends TestCase {

    private  Calculator calc;
    /*
    @Override
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calc = (Calculator)ctx.getBean("calc");
    }*/

    public void testAdd() {
        float result = calc.add(27, 93);
        assertEquals(result,120.0f);
    }

    public void testMultiply() {
        float result = calc.multiply(27, 93);
        assertEquals(result,2511.0f);
    }

    public void testDivide() {
        float result = calc.divide(4, 2);
        assertEquals(result,2.0f);
    }

    public void testSubtract() {
        float result = calc.subtract(93, 27);
        assertEquals(result,66.0f);
    }
}