package com.hiprogrammer.designpattern.create.builder.dto;

import com.hiprogrammer.designpattern.create.builder.api.Item;
import com.hiprogrammer.designpattern.create.builder.api.Packing;
import com.hiprogrammer.designpattern.create.builder.impl.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}