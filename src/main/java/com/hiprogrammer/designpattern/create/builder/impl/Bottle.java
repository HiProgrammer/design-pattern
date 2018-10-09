package com.hiprogrammer.designpattern.create.builder.impl;

import com.hiprogrammer.designpattern.create.builder.api.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}