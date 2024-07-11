package org.framework.rodolfo.freire.git.design.pattern.abstractfactory.util.enums;

public enum EnumShape {

    CIRCLE("CIRCLE"), RECTANGLE("RECTANGLE"), SQUARE("SQUARE");

    private final String description;

    EnumShape(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
