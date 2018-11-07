package br.com.erudio.request.converters;

import java.math.BigDecimal;

public class NumberConverter {

    public static BigDecimal CovertToBigDecimal(String strNumber) {
        if (strNumber == null) return BigDecimal.ZERO; 
        String number = strNumber.replaceAll(",", ".");
        if (IsNumeric(number)) return new BigDecimal(number);
        return BigDecimal.ZERO;
    }

    public static boolean IsNumeric(String strNumber) {
        if (strNumber == null) return false; 
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static BigDecimal sum(String number1, String number2) throws Exception {
        if (IsNumeric(number1) && IsNumeric(number2)) {
            BigDecimal a = CovertToBigDecimal(number1);
            BigDecimal b = CovertToBigDecimal(number2);
            return a.add(b) ;
        }
        throw new Exception();
    }
    
    public static BigDecimal subtraction(String number1, String number2) throws Exception {
        if (IsNumeric(number1) && IsNumeric(number2)) {
            BigDecimal a = CovertToBigDecimal(number1);
            BigDecimal b = CovertToBigDecimal(number2);
            return a.subtract(b) ;
        }
        throw new Exception();
    }   
    
    public static BigDecimal multiply(String number1, String number2) throws Exception {
        if (IsNumeric(number1) && IsNumeric(number2)) {
            BigDecimal a = CovertToBigDecimal(number1);
            BigDecimal b = CovertToBigDecimal(number2);
            return a.multiply(b) ;
        }
        throw new Exception();
    }  
    
    public static BigDecimal divide(String number1, String number2) throws Exception {
        if (IsNumeric(number1) && IsNumeric(number2)) {
            BigDecimal a = CovertToBigDecimal(number1);
            BigDecimal b = CovertToBigDecimal(number2);
            return a.divide(b) ;
        }
        throw new Exception();
    }
    
    
}
