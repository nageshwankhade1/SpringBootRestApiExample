package com.nmw.springboot.model;

import java.io.Serializable;

public class Addition implements Serializable {
    private Long firstNum;
    private Long secondNum;

     Addition(){}

    public Addition(Long firstNum, Long secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public Long getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Long firstNum) {
        this.firstNum = firstNum;
    }

    public Long getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Long secondNum) {
        this.secondNum = secondNum;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                '}';
    }
}
