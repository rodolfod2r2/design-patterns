package org.framework.rodolfo.freire.git.design.patterns.builder.item.drink;

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.0f;
    }

}
