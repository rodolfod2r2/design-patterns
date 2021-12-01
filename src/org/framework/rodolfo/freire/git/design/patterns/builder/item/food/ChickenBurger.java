package org.framework.rodolfo.freire.git.design.patterns.builder.item.food;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 35.0f;
    }

}
