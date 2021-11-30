package org.framework.rodolfo.freire.git.design.patterns.abstractfactory.factorys;

import org.framework.rodolfo.freire.git.design.patterns.util.enums.EnumFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(EnumFactory choice) {
        return switch (choice) {
            case SHAPE -> new ShapeFactory();
            case COLOR -> new ColorFactory();
            default -> null;
        };
    }

}
