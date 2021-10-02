package com.kodilla.patterns.prototype.library;

public class Prototype <A> implements Cloneable{
    @Override
    public A clone() throws CloneNotSupportedException {
        return (A)super.clone();
    }
}