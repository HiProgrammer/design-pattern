package com.hiprogrammer.designpattern.create.abstractfactory;

import com.hiprogrammer.designpattern.create.factory.api.Color;
import com.hiprogrammer.designpattern.create.factory.api.Shape;
import com.hiprogrammer.designpattern.create.factory.enums.ColorEnum;
import com.hiprogrammer.designpattern.create.factory.enums.FactoryEnum;
import com.hiprogrammer.designpattern.create.factory.enums.ShapeEnum;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryEnum.SHAPE);

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape(ShapeEnum.CIRCLE);

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape(ShapeEnum.RECTANGLE);

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        Shape shape3 = shapeFactory.getShape(ShapeEnum.SQUARE);

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryEnum.COLOR);

        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor(ColorEnum.RED);

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor(ColorEnum.GREEN);

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        Color color3 = colorFactory.getColor(ColorEnum.BLUE);

        //调用 Blue 的 fill 方法
        color3.fill();
    }
}