package com.hiprogrammer.designpattern.create.prototype.dto.shapes;

import com.hiprogrammer.designpattern.create.prototype.dto.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}