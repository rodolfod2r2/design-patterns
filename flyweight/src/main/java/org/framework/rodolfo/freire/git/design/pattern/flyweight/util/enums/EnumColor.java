package org.framework.rodolfo.freire.git.design.pattern.flyweight.util.enums;

public enum EnumColor {

    BLACK("BLACK"), BLUE("BLUE"), GREEN("GREEN"), RED("RED"), WHITE("WHITE");

    private final String description;

    EnumColor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
