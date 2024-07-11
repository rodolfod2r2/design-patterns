package org.framework.rodolfo.freire.git.design.pattern.abstractfactory.factorys;

import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.fills.Color;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.shapes.Shape;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumColor;
import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumShape;

public abstract class AbstractFactory {

    public abstract Color getColor(EnumColor color);

    public abstract Shape getShape(EnumShape shape);

}
