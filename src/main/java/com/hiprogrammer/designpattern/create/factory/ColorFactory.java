package com.hiprogrammer.designpattern.create.factory;

import com.hiprogrammer.designpattern.create.abstractfactory.AbstractFactory;
import com.hiprogrammer.designpattern.create.factory.api.Color;
import com.hiprogrammer.designpattern.create.factory.api.Shape;
import com.hiprogrammer.designpattern.create.factory.dto.Blue;
import com.hiprogrammer.designpattern.create.factory.dto.Green;
import com.hiprogrammer.designpattern.create.factory.dto.Red;
import com.hiprogrammer.designpattern.create.factory.enums.ColorEnum;
import com.hiprogrammer.designpattern.create.factory.enums.ShapeEnum;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeEnum shapeType) {
        return null;
    }

    @Override
    public Color getColor(ColorEnum color) {
        if (color == null) {
            return null;
        }
        switch (color) {
            case RED:
                return new Red();
            case GREEN:
                return new Green();
            case BLUE:
                return new Blue();
            default:
                return null;
        }
    }
}