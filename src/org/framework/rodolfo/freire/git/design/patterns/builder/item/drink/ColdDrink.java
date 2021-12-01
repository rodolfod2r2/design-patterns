package org.framework.rodolfo.freire.git.design.patterns.builder.item.drink;

import org.framework.rodolfo.freire.git.design.patterns.builder.item.Item;
import org.framework.rodolfo.freire.git.design.patterns.builder.packing.Bottle;
import org.framework.rodolfo.freire.git.design.patterns.builder.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
