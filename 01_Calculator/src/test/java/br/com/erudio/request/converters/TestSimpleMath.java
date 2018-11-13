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
    
    @Test
    public void multiplicationTest() throws Exception {
        assertEquals(new BigDecimal("4"), math.multiplication(new BigDecimal("2"), new BigDecimal("2")));
        assertEquals(new BigDecimal("2.50"), math.multiplication(new BigDecimal("2.5"), new BigDecimal("1.0")));
        assertEquals(new BigDecimal("-8"), math.multiplication(new BigDecimal("-2"), new BigDecimal("4")));
        assertEquals(new BigDecimal("6.63"), math.multiplication(new BigDecimal("1.3"), new BigDecimal("5.1")));
        assertEquals(new BigDecimal("21.100000250"), math.multiplication(new BigDecimal("4.22000005"), new BigDecimal("5.0")));
        assertEquals(new BigDecimal("8.44400000000016"), math.multiplication(new BigDecimal("2.11100000000004"), new BigDecimal("4")));
    }
    
    @Test
    public void divisionTest() throws Exception {
        assertEquals(new BigDecimal("1.00000000"), math.division(new BigDecimal("2"), new BigDecimal("2")));
        assertEquals(new BigDecimal("2.50000000"), math.division(new BigDecimal("2.5"), new BigDecimal("1.0")));
        assertEquals(new BigDecimal("-0.50000000"), math.division(new BigDecimal("-2"), new BigDecimal("4")));
        assertEquals(new BigDecimal("0.25490196"), math.division(new BigDecimal("1.3"), new BigDecimal("5.1")));
        assertEquals(new BigDecimal("0.84400001"), math.division(new BigDecimal("4.22000005"), new BigDecimal("5.0")));
        assertEquals(new BigDecimal("0.52775000"), math.division(new BigDecimal("2.11100000000004"), new BigDecimal("4")));
    }
        
    @Test
    public void squareRootTest() throws Exception {
        assertEquals(new BigDecimal("3.0000"), math.squareRoot(new BigDecimal("9")));
        assertEquals(new BigDecimal("4.0000"), math.squareRoot(new BigDecimal("16")));
        assertEquals(new BigDecimal("8.0000"), math.squareRoot(new BigDecimal("64")));
        assertEquals(new BigDecimal("12.0000"), math.squareRoot(new BigDecimal("144")));
        assertEquals(new BigDecimal("2.8284"), math.squareRoot(new BigDecimal("8")));
        assertEquals(new BigDecimal("16.0000"), math.squareRoot(new BigDecimal("256")));
    }
        
    @Test(expected = NullPointerException.class)
    public void sumWithExceptionTest() throws UnsuportedMathOperationException {
        assertEquals(new BigDecimal("4"), math.sum(null, new BigDecimal("2")));
    }
}
