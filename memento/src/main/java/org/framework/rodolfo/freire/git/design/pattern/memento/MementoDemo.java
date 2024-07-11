package org.framework.rodolfo.freire.git.design.pattern.memento;

import org.framework.rodolfo.freire.git.design.pattern.memento.actor.Keeper;
import org.framework.rodolfo.freire.git.design.pattern.memento.actor.Memento;
import org.framework.rodolfo.freire.git.design.pattern.memento.actor.Originator;

public class MementoDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Keeper keeper = new Keeper();

        originator.setState("State #1");
        originator.setState("State #2");
        keeper.add(originator.saveStateToMemento());

        originator.setState("State #3");
        keeper.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.printf("Current State: %s \n", originator.getState());

        for (Memento k : keeper.getMementoList()) {
            System.out.printf("State saved %s \n", k.getState());
        }

    }

}
