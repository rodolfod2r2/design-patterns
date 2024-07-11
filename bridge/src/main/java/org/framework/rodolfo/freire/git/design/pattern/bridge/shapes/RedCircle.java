package org.framework.rodolfo.freire.git.design.pattern.bridge.shapes;

import org.framework.rodolfo.freire.git.design.pattern.bridge.draw.DrawAPI;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(
                "Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]"
        );
    }
}
