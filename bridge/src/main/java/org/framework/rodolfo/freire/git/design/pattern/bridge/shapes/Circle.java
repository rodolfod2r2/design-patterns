package org.framework.rodolfo.freire.git.design.pattern.bridge.shapes;

import org.framework.rodolfo.freire.git.design.pattern.bridge.draw.DrawAPI;

public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
