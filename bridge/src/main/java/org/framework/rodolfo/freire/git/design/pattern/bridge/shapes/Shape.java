package org.framework.rodolfo.freire.git.design.pattern.bridge.shapes;

import org.framework.rodolfo.freire.git.design.pattern.bridge.draw.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
