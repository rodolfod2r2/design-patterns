package org.framework.rodolfo.freire.git.design.pattern.abstractfactory.factorys;

import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.fills.Color;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.shapes.Circle;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.shapes.Rectangle;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.shapes.Shape;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.shapes.Square;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumColor;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumShape;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(EnumShape shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
        };
    }

    @Override
    public Color getColor(EnumColor color) {
        return null;
    }

}
