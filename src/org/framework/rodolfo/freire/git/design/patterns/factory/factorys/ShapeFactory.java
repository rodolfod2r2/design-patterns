package org.framework.rodolfo.freire.git.design.patterns.factory.factorys;

import org.framework.rodolfo.freire.git.design.patterns.factory.shapes.Circle;
import org.framework.rodolfo.freire.git.design.patterns.factory.shapes.Rectangle;
import org.framework.rodolfo.freire.git.design.patterns.factory.shapes.Shape;
import org.framework.rodolfo.freire.git.design.patterns.factory.shapes.Square;
import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumShape;

public class ShapeFactory {

    public Shape getShape(EnumShape shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            default -> null;
        };
    }

}
