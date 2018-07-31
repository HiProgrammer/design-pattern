package com.hiprogrammer.designpattern.create.abstractFactory;

import com.hiprogrammer.designpattern.create.factory.ShapeFactory;
import com.hiprogrammer.designpattern.create.factory.ColorFactory;
import com.hiprogrammer.designpattern.create.factory.enums.FactoryEnum;

public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryEnum choice) {
        if (choice.equals(FactoryEnum.SHAPE)) {
            return new ShapeFactory();
        } else if (choice.equals(FactoryEnum.COLOR)) {
            return new ColorFactory();
        }
        return null;
    }
}