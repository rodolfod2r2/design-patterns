package org.framework.rodolfo.freire.git.design.patterns.adapter.player;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void player(String fileName) {
        System.out.println("VlcPlayer - Name: " + fileName);
    }

}
