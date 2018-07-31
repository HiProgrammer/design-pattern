package com.hiprogrammer.designpattern.create.factory.dto;

import com.hiprogrammer.designpattern.create.factory.api.Color;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}