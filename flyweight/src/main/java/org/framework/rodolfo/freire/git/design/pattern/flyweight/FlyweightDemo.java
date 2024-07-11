package org.framework.rodolfo.freire.git.design.pattern.flyweight;

import org.framework.rodolfo.freire.git.design.pattern.flyweight.shapes.Circle;
import org.framework.rodolfo.freire.git.design.pattern.flyweight.shapes.ShapeFactory;
import org.framework.rodolfo.freire.git.design.pattern.flyweight.util.enums.EnumColor;

import java.util.Random;

public class FlyweightDemo {

    private static final int initElements = 0;
    private static final int maxElements = 20;
    private static final int maxColorElements = 5;
    private static final int maxAxis = 100;

    public static void main(String[] args) {

        for (int i = initElements; i < maxElements; ++i) {

            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRandomX() * getRandomY());
            circle.draw();

        }
    }

    private static String getRandomColor() {
        Random random = new Random();
        int indexer = random.nextInt(5);
        EnumColor enumColor = EnumColor.values()[indexer];
        return enumColor.getDescription();
    }

    private static int getRandomX() {
        Random random = new Random();
        return random.nextInt(maxAxis);
    }

    private static int getRandomY() {
        Random random = new Random();
        return random.nextInt(maxAxis);
    }

}
