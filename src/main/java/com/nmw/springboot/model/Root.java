package com.nmw.springboot.model;

public class Root {
    private Global global;

    Root() {}

    public Root(Global global) {
        this.global = global;
    }

    public Global getGlobal() {
        return global;
    }

    public void setGlobal(Global global) {
        this.global = global;
    }

    @Override
    public String toString() {
        return "Root{" +
                "global=" + global +
                '}';
    }
}
