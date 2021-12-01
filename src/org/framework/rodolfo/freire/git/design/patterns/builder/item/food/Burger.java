package org.framework.rodolfo.freire.git.design.patterns.builder.item.food;

import org.framework.rodolfo.freire.git.design.patterns.builder.item.Item;
import org.framework.rodolfo.freire.git.design.patterns.builder.packing.Packing;
import org.framework.rodolfo.freire.git.design.patterns.builder.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
