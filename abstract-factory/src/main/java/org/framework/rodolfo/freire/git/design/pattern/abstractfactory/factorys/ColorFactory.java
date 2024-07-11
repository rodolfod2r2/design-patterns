package org.framework.rodolfo.freire.git.design.pattern.abstractfactory.factorys;

import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.fills.Blue;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.fills.Color;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.fills.Green;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.fills.Red;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.shapes.Shape;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumColor;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumShape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(EnumColor color) {
        return switch (color) {
            case RED -> new Red();
            case GREEN -> new Green();
            case BLUE -> new Blue();
            default -> null;
        };
    }

    @Override
    public Shape getShape(EnumShape shape) {
        return null;
    }

}
