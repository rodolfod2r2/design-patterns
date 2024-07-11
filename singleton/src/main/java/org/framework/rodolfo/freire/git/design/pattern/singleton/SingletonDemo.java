package org.framework.rodolfo.freire.git.design.pattern.singleton;

import org.framework.rodolfo.freire.git.design.pattern.singleton.singletons.SingletonObject;

public class SingletonDemo {

    public static void main(String[] args) {

        SingletonObject singletonObject = SingletonObject.getInstance();

        singletonObject.showMessage();

    }
}
