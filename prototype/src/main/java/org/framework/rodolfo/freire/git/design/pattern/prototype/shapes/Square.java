package org.framework.rodolfo.freire.git.design.pattern.prototype.shapes;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square -> draw()");
    }
}
