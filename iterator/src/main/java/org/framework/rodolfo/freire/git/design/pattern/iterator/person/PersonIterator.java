package org.framework.rodolfo.freire.git.design.pattern.iterator.person;

import org.framework.rodolfo.freire.git.design.pattern.iterator.interfaces.Iterator;

public class PersonIterator implements Iterator {

    int index;

    @Override
    public boolean hasNext() {
        return index < (long) PersonRepository.getInstance().getNames().size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return PersonRepository.getInstance().getNames().get(index++);
        }
        return null;
    }

}
