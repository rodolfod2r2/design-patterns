package org.framework.rodolfo.freire.git.design.pattern.mediator.chat;

import org.framework.rodolfo.freire.git.design.pattern.mediator.model.User;

import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date() + " [" + user.getName() + "] : " + message);
    }

}
