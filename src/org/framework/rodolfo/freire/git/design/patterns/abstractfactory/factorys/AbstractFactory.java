package org.framework.rodolfo.freire.git.design.patterns.abstractfactory.factorys;

import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.fills.Color;
import org.framework.rodolfo.freire.git.design.patterns.abstractfactory.shapes.Shape;
import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumColor;
import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumShape;

public abstract class AbstractFactory {
    public abstract Color getColor(EnumColor color);

    public abstract Shape getShape(EnumShape shape);
}
