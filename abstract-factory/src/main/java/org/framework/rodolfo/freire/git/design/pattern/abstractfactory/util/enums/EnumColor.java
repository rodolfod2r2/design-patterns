package org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums;

public enum EnumColor {
    RED("RED"), GREEN("GREEN"), BLUE("BLUE");

    private final String description;

    EnumColor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
