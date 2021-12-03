package org.framework.rodolfo.freire.git.design.patterns.bridge.shapes;

import org.framework.rodolfo.freire.git.design.patterns.bridge.draw.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(
                "Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]"
        );
    }
}
