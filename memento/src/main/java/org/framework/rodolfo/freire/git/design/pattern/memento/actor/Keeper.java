package org.framework.rodolfo.freire.git.design.pattern.memento.actor;

import java.util.ArrayList;
import java.util.List;

public class Keeper {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public List<Memento> getMementoList() {
        return mementoList;
    }
}
