package org.framework.rodolfo.freire.git.design.pattern.filter.util.enums;

public enum EnumGender {
    MEN("MEN"), WOMAN("WOMAN");

    private final String description;

    EnumGender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
