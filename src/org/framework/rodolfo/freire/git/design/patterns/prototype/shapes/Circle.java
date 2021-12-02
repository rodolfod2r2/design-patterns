package org.framework.rodolfo.freire.git.design.patterns.prototype.shapes;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
