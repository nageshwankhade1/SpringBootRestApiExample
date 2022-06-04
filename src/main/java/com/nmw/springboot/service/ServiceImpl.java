package com.nmw.springboot.service;


import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ServiceImpl implements Services {

    @Override
    public BigDecimal addition(BigDecimal firstNum, BigDecimal secondNum) {
        return firstNum.add(secondNum);
    }

    @Override
    public BigDecimal subtraction() {
        String s;
        return null;
    }

    @Override
    public BigDecimal multiplication() {
        return null;
    }

    @Override
    public BigDecimal division() {
        return null;
    }
}
