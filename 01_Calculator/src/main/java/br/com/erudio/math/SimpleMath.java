package br.com.erudio.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleMath {

    public BigDecimal sum(BigDecimal firstNumber, BigDecimal secondNumber) {
        if (firstNumber == null || secondNumber == null) throw new NullPointerException();
        return firstNumber.add(secondNumber);
    }

    public BigDecimal subtraction(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.subtract(secondNumber);
    }

    public BigDecimal multiplication(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }

    public BigDecimal division(BigDecimal firstNumber, BigDecimal secondNumber) {
        //BigDecimal bd = new BigDecimal(12.12, MathContext.DECIMAL32).divide(new BigDecimal(2)).setScale(2, RoundingMode.HALF_UP);
        return firstNumber.divide(secondNumber, 8, RoundingMode.HALF_UP);
    }

    public BigDecimal mean(BigDecimal firstNumber, BigDecimal secondNumber) {
        return (firstNumber.add(secondNumber)).divide(new BigDecimal("2"));
    }
    
    public BigDecimal squareRoot(BigDecimal number) {
        BigDecimal x = new BigDecimal(Math.sqrt(number.doubleValue()));
        return x.add(new BigDecimal(number.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0)));
    }
}