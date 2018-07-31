package com.hiprogrammer.designpattern.create.factory.dto;

import com.hiprogrammer.designpattern.create.factory.api.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}