package org.framework.rodolfo.freire.git.design.pattern.mediator;

import org.framework.rodolfo.freire.git.design.pattern.mediator.model.User;

public class MediatorDemo {

    public static void main(String[] args) {
        User tonyStark = new User("Tony Stark");
        User Steve = new User("Steve Rogers");
        tonyStark.sendMessage("Hi! Tony!");
        Steve.sendMessage("Hello! Steve!");
    }
}
