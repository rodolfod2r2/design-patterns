package org.framework.rodolfo.freire.git.design.pattern.memento.actor;

public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
