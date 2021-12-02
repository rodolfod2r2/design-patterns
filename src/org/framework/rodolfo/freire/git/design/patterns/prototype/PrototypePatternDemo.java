package org.framework.rodolfo.freire.git.design.patterns.prototype;

import org.framework.rodolfo.freire.git.design.patterns.prototype.shapes.Shape;
import org.framework.rodolfo.freire.git.design.patterns.prototype.shapes.ShapeCache;

public class PrototypePatternDemo {

    public static void main(String[] args) {

        Shape clonedShape;
        ShapeCache.loadCache();

        clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        clonedShape = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape.getType());

        clonedShape = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape.getType());

    }
}
