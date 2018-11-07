package br.com.erudio.request.converters;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class TestNumberConverter {

    @Test
    public void isNumericTest() {
        assertFalse(NumberConverter.IsNumeric("A"));
        assertFalse(NumberConverter.IsNumeric(null));
        assertFalse(NumberConverter.IsNumeric(""));
        assertFalse(NumberConverter.IsNumeric(" "));
        assertTrue(NumberConverter.IsNumeric("5"));
        assertTrue(NumberConverter.IsNumeric("0"));
        assertTrue(NumberConverter.IsNumeric("-2"));
        assertTrue(NumberConverter.IsNumeric("5,2"));
        assertTrue(NumberConverter.IsNumeric("5.2"));
    }

    @Test
    public void sumTest() throws Exception {
        assertEquals(new BigDecimal("4"), NumberConverter.sum("2", "2"));
        assertEquals(new BigDecimal("3.5"), NumberConverter.sum("2,5", "1,0"));
        assertEquals(new BigDecimal("2"), NumberConverter.sum("-2", "4"));
        assertEquals(new BigDecimal("6.4"), NumberConverter.sum("1.3", "5.1"));
    }
    
    @Test(expected = Exception.class)
    public void sumWithExceptionTest() throws Exception {
        assertEquals(new BigDecimal("4"), NumberConverter.sum("A", "2"));
    }
    
    
    
    @Test
    public void convertToDoubleTest() {
       
        BigDecimal expected = new BigDecimal("5.2");
        
        assertEquals(BigDecimal.ZERO, NumberConverter.CovertToBigDecimal("A"));
        assertEquals(BigDecimal.ZERO, NumberConverter.CovertToBigDecimal(null));
        assertEquals(BigDecimal.ZERO, NumberConverter.CovertToBigDecimal(" "));
        assertEquals(BigDecimal.ZERO, NumberConverter.CovertToBigDecimal(""));
        assertEquals(new BigDecimal("5"), NumberConverter.CovertToBigDecimal("5"));
        assertEquals(BigDecimal.ZERO, NumberConverter.CovertToBigDecimal("0"));
        assertEquals(new BigDecimal(-2f), NumberConverter.CovertToBigDecimal("-2"));
        assertEquals(expected, NumberConverter.CovertToBigDecimal("5,2"));
        assertEquals(expected, NumberConverter.CovertToBigDecimal("5.2"));
    }
    
    

}
