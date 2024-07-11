package org.framework.rodolfo.freire.git.design.pattern.factory.factorys;

import org.framework.rodolfo.freire.git.design.pattern.factory.shapes.Circle;
import org.framework.rodolfo.freire.git.design.pattern.factory.shapes.Rectangle;
import org.framework.rodolfo.freire.git.design.pattern.factory.shapes.Shape;
import org.framework.rodolfo.freire.git.design.pattern.factory.shapes.Square;
import org.framework.rodolfo.freire.git.design.pattern.factory.util.enums.EnumShape;

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
