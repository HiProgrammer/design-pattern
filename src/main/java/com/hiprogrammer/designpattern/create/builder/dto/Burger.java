package com.hiprogrammer.designpattern.create.builder.dto;

import com.hiprogrammer.designpattern.create.builder.api.Item;
import com.hiprogrammer.designpattern.create.builder.api.Packing;
import com.hiprogrammer.designpattern.create.builder.impl.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}