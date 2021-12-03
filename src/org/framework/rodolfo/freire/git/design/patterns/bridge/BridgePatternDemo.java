package org.framework.rodolfo.freire.git.design.patterns.bridge;

import org.framework.rodolfo.freire.git.design.patterns.bridge.shapes.Circle;
import org.framework.rodolfo.freire.git.design.patterns.bridge.shapes.GreenCircle;
import org.framework.rodolfo.freire.git.design.patterns.bridge.shapes.RedCircle;
import org.framework.rodolfo.freire.git.design.patterns.bridge.shapes.Shape;

public class BridgePatternDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();

    }
}
