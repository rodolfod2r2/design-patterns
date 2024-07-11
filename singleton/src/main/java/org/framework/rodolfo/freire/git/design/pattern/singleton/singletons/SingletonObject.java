package org.framework.rodolfo.freire.git.design.pattern.singleton.singletons;

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
        System.out.println("SingletonObject -> showMessage()");
    }

}
