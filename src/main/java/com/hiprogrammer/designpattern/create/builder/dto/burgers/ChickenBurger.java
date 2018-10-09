package com.hiprogrammer.designpattern.create.builder.dto.burgers;

import com.hiprogrammer.designpattern.create.builder.dto.Burger;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}