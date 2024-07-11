package org.framework.rodolfo.freire.git.design.pattern.builder.meal;

import org.framework.rodolfo.freire.git.design.pattern.builder.item.drink.Coke;
import org.framework.rodolfo.freire.git.design.pattern.builder.item.drink.Pepsi;
import org.framework.rodolfo.freire.git.design.pattern.builder.item.food.ChickenBurger;
import org.framework.rodolfo.freire.git.design.pattern.builder.item.food.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
