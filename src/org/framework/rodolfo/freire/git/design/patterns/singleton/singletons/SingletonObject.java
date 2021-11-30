package org.framework.rodolfo.freire.git.design.patterns.singleton.singletons;

public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Instance SingletonObject::showMessage() method.");
    }

}
