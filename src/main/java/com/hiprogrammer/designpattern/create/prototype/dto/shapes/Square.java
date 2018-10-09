package com.hiprogrammer.designpattern.create.prototype.dto.shapes;

import com.hiprogrammer.designpattern.create.prototype.dto.Shape;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}