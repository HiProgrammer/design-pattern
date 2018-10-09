package com.hiprogrammer.designpattern.create.builder.dto.drinks;

import com.hiprogrammer.designpattern.create.builder.dto.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}