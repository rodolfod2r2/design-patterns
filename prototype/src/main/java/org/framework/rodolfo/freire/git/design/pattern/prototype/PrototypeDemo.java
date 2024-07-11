package org.framework.rodolfo.freire.git.design.pattern.prototype;

import org.framework.rodolfo.freire.git.design.pattern.prototype.shapes.Shape;
import org.framework.rodolfo.freire.git.design.pattern.prototype.shapes.ShapeCache;

public class PrototypeDemo {

    public static void main(String[] args) {

        Shape clonedShape;
        ShapeCache.loadCache();

        clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape -> " + clonedShape.getType());

        clonedShape = ShapeCache.getShape("2");
        System.out.println("Shape -> " + clonedShape.getType());

        clonedShape = ShapeCache.getShape("3");
        System.out.println("Shape -> " + clonedShape.getType());

    }
}
