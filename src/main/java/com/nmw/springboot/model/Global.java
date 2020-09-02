package com.nmw.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Global implements Serializable
{
    @JsonProperty
    Addition addition;

     Global(){ new Addition(); }

    public Global(Addition addition) {
        this.addition = addition;
    }

    public Addition getAddition() {
        return addition;
    }

    public void setAddition(Addition addition) {
        this.addition = addition;
    }

    @Override
    public String toString() {
        return "Global{" +
                "addition=" + addition +
                '}';
    }
}
