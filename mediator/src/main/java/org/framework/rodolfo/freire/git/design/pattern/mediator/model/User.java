package org.framework.rodolfo.freire.git.design.pattern.mediator.model;

import org.framework.rodolfo.freire.git.design.pattern.mediator.chat.ChatRoom;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}