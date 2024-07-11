package org.framework.rodolfo.freire.git.design.pattern.builder.item.food;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
