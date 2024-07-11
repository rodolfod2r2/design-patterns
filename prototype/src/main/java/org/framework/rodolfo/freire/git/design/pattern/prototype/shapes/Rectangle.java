package org.framework.rodolfo.freire.git.design.pattern.prototype.shapes;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle -> draw()");
    }
}
