package org.framework.rodolfo.freire.git.design.pattern.decorator;

import org.framework.rodolfo.freire.git.design.pattern.decorator.shapes.Circle;
import org.framework.rodolfo.freire.git.design.pattern.decorator.shapes.Rectangle;
import org.framework.rodolfo.freire.git.design.pattern.decorator.shapes.RedShapeDecorator;
import org.framework.rodolfo.freire.git.design.pattern.decorator.shapes.Shape;

public class DecoratorDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
