package org.framework.rodolfo.freire.git.design.pattern.abstractfactory;

import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.factorys.AbstractFactory;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.factorys.FactoryProducer;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.fills.Color;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.shapes.Shape;

import static org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumColor.*;
import static org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumFactory.COLOR;
import static org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumFactory.SHAPE;
import static org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumShape.*;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(SHAPE);

        Shape shape1 = shapeFactory.getShape(CIRCLE);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(RECTANGLE);
        shape2.draw();
        Shape shape3 = shapeFactory.getShape(SQUARE);
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(COLOR);

        Color color1 = colorFactory.getColor(RED);
        color1.fill();
        Color color2 = colorFactory.getColor(GREEN);
        color2.fill();
        Color color3 = colorFactory.getColor(BLUE);
        color3.fill();

    }

}
