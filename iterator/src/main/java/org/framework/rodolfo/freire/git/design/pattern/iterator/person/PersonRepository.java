package org.framework.rodolfo.freire.git.design.pattern.iterator.person;

import org.framework.rodolfo.freire.git.design.pattern.iterator.interfaces.Container;
import org.framework.rodolfo.freire.git.design.pattern.iterator.interfaces.Iterator;

import java.util.List;

public class PersonRepository implements Container {

    private static PersonRepository instance;
    private List<String> names;

    private PersonRepository() {
    }

    public static PersonRepository getInstance() {
        if (instance == null) {
            instance = new PersonRepository();
        }
        return instance;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new PersonIterator();
    }

}
