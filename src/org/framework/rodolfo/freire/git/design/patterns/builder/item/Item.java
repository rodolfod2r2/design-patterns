package org.framework.rodolfo.freire.git.design.patterns.builder.item;

import org.framework.rodolfo.freire.git.design.patterns.builder.packing.Packing;

public interface Item {

    String name();

    Packing packing();

    float price();

}
