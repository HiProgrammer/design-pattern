package com.hiprogrammer.designpattern.create.factory.dto;

import com.hiprogrammer.designpattern.create.factory.api.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}