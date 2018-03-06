package com.jacobs.interfaces;

import junit.framework.TestCase;

public class CalcImplementTest extends TestCase {

    Calculator calcObj = new CalcImplement();

    public void testAdd() {
        float result = calcObj.add(27, 93);
        assertEquals(result,120.0f);
    }

    public void testMultiply() {
        float result = calcObj.multiply(27, 93);
        assertEquals(result,2511.0f);
    }

    public void testDivide() {
        float result = calcObj.divide(4, 2);
        assertEquals(result,2.0f);
    }

    public void testSubtract() {
        float result = calcObj.subtract(93, 27);
        assertEquals(result,66.0f);
    }
}