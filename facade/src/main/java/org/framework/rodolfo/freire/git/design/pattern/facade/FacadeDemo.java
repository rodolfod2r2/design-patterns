package org.framework.rodolfo.freire.git.design.pattern.facade;

import org.framework.rodolfo.freire.git.design.pattern.facade.shapes.ShapeMaker;

public class FacadeDemo {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }
}
