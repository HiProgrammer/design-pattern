package com.hiprogrammer.designpattern.create.builder.dto.burgers;

import com.hiprogrammer.designpattern.create.builder.dto.Burger;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}