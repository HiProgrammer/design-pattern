package com.hiprogrammer.designpattern.create.factory;

import com.hiprogrammer.designpattern.create.factory.api.Shape;
import com.hiprogrammer.designpattern.create.factory.enums.ShapeEnum;

public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape(ShapeEnum.CIRCLE);
        //调用 Circle 的 draw 方法
        shape1.draw();
        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape(ShapeEnum.RECTANGLE);
        //调用 Rectangle 的 draw 方法
        shape2.draw();
        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape(ShapeEnum.SQUARE);
        //调用 Square 的 draw 方法
        shape3.draw();
    }
}