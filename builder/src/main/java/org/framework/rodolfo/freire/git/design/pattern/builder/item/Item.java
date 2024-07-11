package org.framework.rodolfo.freire.git.design.pattern.builder.item;

import org.framework.rodolfo.freire.git.design.pattern.builder.packing.Packing;

public interface Item {

    String name();

    Packing packing();

    float price();

}
