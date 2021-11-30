package org.framework.rodolfo.freire.git.design.patterns.singleton;

import org.framework.rodolfo.freire.git.design.patterns.singleton.singletons.SingletonObject;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingletonObject singletonObject = SingletonObject.getInstance();

        singletonObject.showMessage();

    }
}
