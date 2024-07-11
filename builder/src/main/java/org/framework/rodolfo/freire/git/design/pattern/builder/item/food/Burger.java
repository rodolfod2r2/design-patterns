package org.framework.rodolfo.freire.git.design.pattern.builder.item.food;

import org.framework.rodolfo.freire.git.design.pattern.builder.item.Item;
import org.framework.rodolfo.freire.git.design.pattern.builder.packing.Packing;
import org.framework.rodolfo.freire.git.design.pattern.builder.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
