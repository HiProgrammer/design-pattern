package com.hiprogrammer.designpattern.create.builder.dto.drinks;

import com.hiprogrammer.designpattern.create.builder.dto.ColdDrink;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}