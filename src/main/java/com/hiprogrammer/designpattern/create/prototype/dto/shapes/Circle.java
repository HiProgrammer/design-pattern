package com.hiprogrammer.designpattern.create.prototype.dto.shapes;

import com.hiprogrammer.designpattern.create.prototype.dto.Shape;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}