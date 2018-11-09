package br.com.erudio.math;

import java.math.BigDecimal;

public class SimpleMath {

    public BigDecimal sum(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.add(secondNumber);
    }

    public BigDecimal subtraction(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.subtract(secondNumber);
    }

    public BigDecimal multiplication(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }

    public BigDecimal division(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.divide(secondNumber);
    }

    public BigDecimal mean(BigDecimal firstNumber, BigDecimal secondNumber) {
        return (firstNumber.add(secondNumber)).divide(new BigDecimal("2"));
    }
    
    public BigDecimal squareRoot(BigDecimal number) {
        BigDecimal x = new BigDecimal(Math.sqrt(number.doubleValue()));
        return x.add(new BigDecimal(number.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0)));
    }
}