package org.framework.rodolfo.freire.git.design.patterns.abstractfactory.factorys;

import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.fills.Blue;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.fills.Color;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.fills.Green;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.fills.Red;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.shapes.Shape;
import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumColor;
import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumShape;

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
