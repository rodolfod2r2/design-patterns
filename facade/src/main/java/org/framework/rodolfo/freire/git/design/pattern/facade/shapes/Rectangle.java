package org.framework.rodolfo.freire.git.design.pattern.facade.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle -> draw()");
    }
}
