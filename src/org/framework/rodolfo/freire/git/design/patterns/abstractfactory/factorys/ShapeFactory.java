package org.framework.rodolfo.freire.git.design.patterns.abstractfactory.factorys;

import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.fills.Color;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.shapes.Circle;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.shapes.Rectangle;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.shapes.Shape;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.shapes.Square;
import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumColor;
import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumShape;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(EnumShape shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            default -> null;
        };
    }

    @Override
    public Color getColor(EnumColor color) {
        return null;
    }

}
