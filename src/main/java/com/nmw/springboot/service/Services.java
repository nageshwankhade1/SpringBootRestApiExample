package com.nmw.springboot.service;

import java.math.BigDecimal;

public interface Services {

    BigDecimal addition(BigDecimal firstNum, BigDecimal secondNum);
    BigDecimal subtraction();
    BigDecimal multiplication();
    BigDecimal division();
}