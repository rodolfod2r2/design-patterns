package org.framework.rodolfo.freire.git.design.patterns.factory;

import org.framework.rodolfo.freire.git.design.patterns.factory.factorys.ShapeFactory;
import org.framework.rodolfo.freire.git.design.patterns.factory.shapes.Shape;

import static org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumShape.*;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(CIRCLE);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(RECTANGLE);
        shape2.draw();
        Shape shape3 = shapeFactory.getShape(SQUARE);
        shape3.draw();
    }

}
