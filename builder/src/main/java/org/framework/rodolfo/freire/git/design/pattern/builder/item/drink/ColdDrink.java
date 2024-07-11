package org.framework.rodolfo.freire.git.design.pattern.builder.item.drink;

import org.framework.rodolfo.freire.git.design.pattern.builder.item.Item;
import org.framework.rodolfo.freire.git.design.pattern.builder.packing.Bottle;
import org.framework.rodolfo.freire.git.design.pattern.builder.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
