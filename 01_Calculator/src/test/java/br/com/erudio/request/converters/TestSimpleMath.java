package br.com.erudio.request.converters;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;

public class TestSimpleMath {

    private SimpleMath math;
    
    @Before
    public void before() throws Exception {
        math = new SimpleMath();
    }
    
    @Test
    public void sumTest() throws Exception {
        assertEquals(new BigDecimal("4"), math.sum(new BigDecimal("2"), new BigDecimal("2")));
        assertEquals(new BigDecimal("3.5"), math.sum(new BigDecimal("2.5"), new BigDecimal("1.0")));
        assertEquals(new BigDecimal("2"), math.sum(new BigDecimal("-2"), new BigDecimal("4")));
        assertEquals(new BigDecimal("6.4"), math.sum(new BigDecimal("1.3"), new BigDecimal("5.1")));
        assertEquals(new BigDecimal("9.22000005"), math.sum(new BigDecimal("4.22000005"), new BigDecimal("5.0")));
        assertEquals(new BigDecimal("6.11100000000004"), math.sum(new BigDecimal("2.11100000000004"), new BigDecimal("4")));
    }
    
    @Test
    public void subtractionTest() throws Exception {
        assertEquals(new BigDecimal("0"), math.subtraction(new BigDecimal("2"), new BigDecimal("2")));
        assertEquals(new BigDecimal("1.5"), math.subtraction(new BigDecimal("2.5"), new BigDecimal("1.0")));
        assertEquals(new BigDecimal("-6"), math.subtraction(new BigDecimal("-2"), new BigDecimal("4")));
        assertEquals(new BigDecimal("-3.8"), math.subtraction(new BigDecimal("1.3"), new BigDecimal("5.1")));
        assertEquals(new BigDecimal("-0.77999995"), math.subtraction(new BigDecimal("4.22000005"), new BigDecimal("5.0")));
        assertEquals(new BigDecimal("-1.88899999999996"), math.subtraction(new BigDecimal("2.11100000000004"), new BigDecimal("4")));
    }
    
    @Test(expected = NullPointerException.class)
    public void sumWithExceptionTest() throws UnsuportedMathOperationException {
        assertEquals(new BigDecimal("4"), math.sum(null, new BigDecimal("2")));
    }
}
