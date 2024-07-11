package org.framework.rodolfo.freire.git.design.pattern.abstractfactory.factorys;

import org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums.EnumFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(EnumFactory choice) {
        return switch (choice) {
            case SHAPE -> new ShapeFactory();
            case COLOR -> new ColorFactory();
        };
    }

}
