package com.hiprogrammer.designpattern.create.builder.api;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}