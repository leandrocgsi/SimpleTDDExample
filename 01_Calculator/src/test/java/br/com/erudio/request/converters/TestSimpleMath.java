package br.com.erudio.request.converters;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.erudio.exception.UnsuportedMathOperationException;

public class TestSimpleMath {


    @Test
    public void sumTest() throws Exception {
        assertEquals(new BigDecimal("4"), NumberConverter.sum("2", "2"));
        assertEquals(new BigDecimal("3.5"), NumberConverter.sum("2,5", "1,0"));
        assertEquals(new BigDecimal("2"), NumberConverter.sum("-2", "4"));
        assertEquals(new BigDecimal("6.4"), NumberConverter.sum("1.3", "5.1"));
        assertEquals(new BigDecimal("9.22000005"), NumberConverter.sum("4.22000005", "5.0"));
        assertEquals(new BigDecimal("6.11100000000004"), NumberConverter.sum("2.11100000000004", "4"));
    }
    
    @Test(expected = UnsuportedMathOperationException.class)
    public void sumWithExceptionTest() throws UnsuportedMathOperationException {
        assertEquals(new BigDecimal("4"), NumberConverter.sum("A", "2"));
    }
}
