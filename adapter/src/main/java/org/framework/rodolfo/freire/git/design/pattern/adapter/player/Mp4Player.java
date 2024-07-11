package org.framework.rodolfo.freire.git.design.pattern.adapter.player;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void player(String fileName) {
        System.out.println("Mp4Player - Name: " + fileName);
    }

}
