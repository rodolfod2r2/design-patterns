package org.framework.rodolfo.freire.git.design.patterns.bridge.shapes;

import org.framework.rodolfo.freire.git.design.patterns.bridge.draw.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
